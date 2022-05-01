package com.brq.brqProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CERTIFICACOES")
public class Certificacoes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_CERTIFICACAO;
	private String NM_CERTIFICACAO;
	
	@ManyToOne
	@JoinColumn(name = "ID_HABILIDADE")
	private Habilidades habilidades;
	
	public Certificacoes() {		
	}

	public Long getID_CERTIFICACAO() {
		return ID_CERTIFICACAO;
	}


	public void setID_CERTIFICACAO(Long iD_CERTIFICACAO) {
		ID_CERTIFICACAO = iD_CERTIFICACAO;
	}


	public String getNM_CERTIFICACAO() {
		return NM_CERTIFICACAO;
	}


	public void setNM_CERTIFICACAO(String nM_CERTIFICACAO) {
		NM_CERTIFICACAO = nM_CERTIFICACAO;
	}


	public Habilidades getHabilidades() {
		return habilidades;
	}


	public void setHabilidades(Habilidades habilidades) {
		this.habilidades = habilidades;
	}
	
}
