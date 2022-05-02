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
@Table(name="habilidades")
public class Habilidades implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/* CONSTRUCTOR */

	public Habilidades() {}
	
	/* PROPERTIES */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_HABILIDADE")
	private Long id;
	
	@Column(name="NM_HABILIDADE", length=50, nullable=false)
	private String nome;
	
	@ManyToOne(targetEntity=TipoHabilidades.class, fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
	@JoinColumn(name="ID_TIPO_HABILIDADE", referencedColumnName="ID_TIPO_HABILIDADE", nullable=false)
	private TipoHabilidades tipoHabilidades;
	
	/**/

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

	public TipoHabilidades getTipoHabilidades() {
		return tipoHabilidades;
	}

	public void setTipoHabilidades(TipoHabilidades tipoHabilidades) {
		this.tipoHabilidades = tipoHabilidades;
	}

}
