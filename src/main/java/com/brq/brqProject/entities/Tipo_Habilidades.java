package com.brq.brqProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_HABILIDADES")
public class Tipo_Habilidades {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_TIPO_HABILIDADE;
	private String NM_TIPO_HABILIDADE;
	
	public Tipo_Habilidades() {
	}

	public Long getID_TIPO_HABILIDADE() {
		return ID_TIPO_HABILIDADE;
	}

	public void setID_TIPO_HABILIDADE(Long iD_TIPO_HABILIDADE) {
		ID_TIPO_HABILIDADE = iD_TIPO_HABILIDADE;
	}

	public String getNM_TIPO_HABILIDADE() {
		return NM_TIPO_HABILIDADE;
	}

	public void setNM_TIPO_HABILIDADE(String nM_TIPO_HABILIDADE) {
		NM_TIPO_HABILIDADE = nM_TIPO_HABILIDADE;
	}
	
}
