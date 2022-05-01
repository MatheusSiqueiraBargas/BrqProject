package com.brq.brqProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HABILIDADES")
public class Habilidades {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_HABILIDADE;
	private String NM_HABILIDADE;
	
	public Habilidades() {
	}
	
	@ManyToOne
	@JoinColumn(name = "ID_TIPO_HABILIDADE")
	private Tipo_Habilidades tipo_Habilidades;
	
	public Tipo_Habilidades getTipo_Habilidades() {
		return tipo_Habilidades;
	}

	public void setTipo_Habilidades(Tipo_Habilidades tipo_Habilidades) {
		this.tipo_Habilidades = tipo_Habilidades;
	}

	public Long getID_HABILIDADE() {
		return ID_HABILIDADE;
	}

	public void setID_HABILIDADE(Long iD_HABILIDADE) {
		ID_HABILIDADE = iD_HABILIDADE;
	}

	public String getNM_HABILIDADE() {
		return NM_HABILIDADE;
	}

	public void setNM_HABILIDADE(String nM_HABILIDADE) {
		NM_HABILIDADE = nM_HABILIDADE;
	}
	
}
