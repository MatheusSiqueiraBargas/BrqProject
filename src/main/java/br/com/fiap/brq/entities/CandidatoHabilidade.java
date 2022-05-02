package br.com.fiap.brq.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="candidato_habilidade")
public class CandidatoHabilidade implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/* CONSTRUCTOR */
	
	public CandidatoHabilidade() {}
	
	/* PROPERTIES */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_CANDIDATO_HABILIDADE")
	private Long id;
	
	@Column(name="QT_PONTOS_HABILIDADE", length=100, nullable=true)
	private Long quantidadePontos;
	
	@ManyToOne(targetEntity=Candidatos.class, fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
	@JoinColumn(name="ID_CANDIDATO", referencedColumnName="ID_CANDIDATO", nullable=false)
	private Candidatos candidatos;
	
	@ManyToOne(targetEntity=Habilidades.class, fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
	@JoinColumn(name="ID_HABILIDADE", referencedColumnName="ID_HABILIDADE", nullable=false)
	private Habilidades habilidades;
	
	/* GETTERS & SETTERS */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQuantidadePontos() {
		return quantidadePontos;
	}

	public void setQuantidadePontos(Long quantidadePontos) {
		this.quantidadePontos = quantidadePontos;
	}

	public Candidatos getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(Candidatos candidatos) {
		this.candidatos = candidatos;
	}

	public Habilidades getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Habilidades habilidades) {
		this.habilidades = habilidades;
	}

}
