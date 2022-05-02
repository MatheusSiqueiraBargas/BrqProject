package br.com.fiap.brq.services;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import br.com.fiap.brq.entities.Candidatos;
import br.com.fiap.brq.entities.repositories.CandidatosRepository;

import static br.com.fiap.brq.specifications.CandidatosSpecification.filterWithOptions;

@Service
public class CandidatosService {

	@Autowired
	CandidatosRepository repository;
	
	public Page<Candidatos> findAll(Map<String, String> filters, Pageable pageable) {
		return repository.findAll(filterWithOptions(filters), pageable);
	}
	
	public Optional<Candidatos> findById(Long id) {
		return repository.findById(id);
	}
	
	public Candidatos create(Candidatos candidato) {
		Candidatos entity = repository.save(candidato);
		return entity;
	}
	
	public Candidatos update(Candidatos candidato) {
		Candidatos entity = repository.save(candidato);
		return entity;
	}
	
	public void delete(Long id) {
		Candidatos entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado"));
		repository.delete(entity);
	}
	
}
