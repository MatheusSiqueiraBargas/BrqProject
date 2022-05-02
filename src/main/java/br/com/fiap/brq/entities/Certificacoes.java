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
@Table(name="certificacoes")
public class Certificacoes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/* CONSTRUCTOR */

	public Certificacoes() {}
	
	/* PROPERTIES */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_CERTIFICACAO")
	private Long id;
	
	@Column(name="NM_CERTIFICACAO", length=50, nullable=false)
	private String nome;
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Habilidades getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Habilidades habilidades) {
		this.habilidades = habilidades;
	}

}
