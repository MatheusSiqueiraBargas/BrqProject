package br.com.fiap.brq.specifications;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import br.com.fiap.brq.entities.Candidatos;

public class CandidatosSpecification {
	
	private static final String FIELD_SEPARATOR = ".";
	private static final String REGEX_FIELD_SPLITTER = "\\.";
	
	public static Specification<Candidatos> filterWithOptions(final Map<String, String> params) {
		return (root, query, criteriaBuilder) -> {
			List<Predicate> predicates = new ArrayList<>();
			try {
				for (String field: params.keySet()) {
					if (field.contains(FIELD_SEPARATOR)) {
						filterInDepth(params, root, criteriaBuilder, predicates, field);
					} else {
						if (Candidatos.class.getDeclaredField(field) != null) {
							predicates.add(criteriaBuilder.like(root.get(field), "%" + params.get(field) + "%"));
						}
					}
				}
				return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
			return null;
		};
	}
	
	private static void filterInDepth(
			Map<String, String> params, 
			Root<Candidatos> root, 
			CriteriaBuilder criteriaBuilder, 
			List<Predicate> predicates, 
			String field) throws NoSuchFieldException {
		String[] compositeField = field.split(REGEX_FIELD_SPLITTER);
		
		if (compositeField.length == 2) {
			Join<Object, Object> join = root.join(compositeField[0], JoinType.LEFT);
			predicates.add(criteriaBuilder.like(join.get(compositeField[1]), "%" + params.get(field) + "%"));
		} else if (Candidatos.class.getDeclaredField(compositeField[0]).getType().getDeclaredField(compositeField[1]) != null) {
			predicates.add(criteriaBuilder.like(root.get(compositeField[0]).get(compositeField[1]), "%" + params.get(field) + "%"));
		}
	}
	
}
