package com.brq.brqProject.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CANDIDATOS")
public class Candidatos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_CANDIDATO;
	private String NM_CANDIDATO;
	private Long NR_CPF;
	private Long NR_CELULAR;
	private String CD_SEXO;
	private String DT_NASCIMENTO;
	private String DS_EMAIL;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
	    name="CANDIDATO_CERTIFICACAO", 
	    joinColumns={ @JoinColumn(name="ID_CANDIDATO") }, 
	    inverseJoinColumns={ @JoinColumn(name="ID_CERTIFICACAO") }
	)
	private List<Certificacoes> certificacoes;
	
	public Candidatos() {
	}

	public List<Certificacoes> getCertificacoes() {
		return certificacoes;
	}

	public void setCertificacoes(List<Certificacoes> certificacoes) {
		this.certificacoes = certificacoes;
	}

	public Long getID_CANDIDATO() {
		return ID_CANDIDATO;
	}

	public void setID_CANDIDATO(Long iD_CANDIDATO) {
		ID_CANDIDATO = iD_CANDIDATO;
	}
	
	public String getNM_CANDIDATO() {
		return NM_CANDIDATO;
	}

	public void setNM_CANDIDATO(String nM_CANDIDATO) {
		NM_CANDIDATO = nM_CANDIDATO;
	}

	public Long getNR_CPF() {
		return NR_CPF;
	}

	public void setNR_CPF(Long nR_CPF) {
		NR_CPF = nR_CPF;
	}

	public Long getNR_CELULAR() {
		return NR_CELULAR;
	}

	public void setNR_CELULAR(Long nR_CELULAR) {
		NR_CELULAR = nR_CELULAR;
	}

	public String getCD_SEXO() {
		return CD_SEXO;
	}

	public void setCD_SEXO(String cD_SEXO) {
		CD_SEXO = cD_SEXO;
	}

	public String getDT_NASCIMENTO() {
		return DT_NASCIMENTO;
	}

	public void setDT_NASCIMENTO(String dT_NASCIMENTO) {
		DT_NASCIMENTO = dT_NASCIMENTO;
	}

	public String getDS_EMAIL() {
		return DS_EMAIL;
	}

	public void setDS_EMAIL(String dS_EMAIL) {
		DS_EMAIL = dS_EMAIL;
	}
}
