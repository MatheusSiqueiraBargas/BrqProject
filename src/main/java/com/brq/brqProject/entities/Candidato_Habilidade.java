package com.brq.brqProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CANDIDATO_HABILIDADE")
public class Candidato_Habilidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_CANDIDATO_HABILIDADE;
	private Long QT_PONTOS_HABILIDADE;
	
	@ManyToOne
	@JoinColumn(name = "ID_CANDIDATO")
	private Candidatos candidatos;
	
	@ManyToOne
	@JoinColumn(name = "ID_HABILIDADE")
	private Habilidades habilidades;
		
	public Candidato_Habilidade() {
	}
	
	public Habilidades getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Habilidades habilidades) {
		this.habilidades = habilidades;
	}

	public Long getID_CANDIDATO_HABILIDADE() {
		return ID_CANDIDATO_HABILIDADE;
	}

	public void setID_CANDIDATO_HABILIDADE(Long iD_CANDIDATO_HABILIDADE) {
		ID_CANDIDATO_HABILIDADE = iD_CANDIDATO_HABILIDADE;
	}

	public Long getQT_PONTOS_HABILIDADE() {
		return QT_PONTOS_HABILIDADE;
	}

	public void setQT_PONTOS_HABILIDADE(Long qT_PONTOS_HABILIDADE) {
		QT_PONTOS_HABILIDADE = qT_PONTOS_HABILIDADE;
	}

	public Candidatos getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(Candidatos candidatos) {
		this.candidatos = candidatos;
	}
	
}
