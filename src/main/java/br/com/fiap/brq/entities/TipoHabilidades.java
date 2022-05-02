package br.com.fiap.brq.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_habilidades")
public class TipoHabilidades implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/* CONSTRUCTOR */

	public TipoHabilidades() {}
	
	/* PROPERTIES */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_TIPO_HABILIDADE")
	private Long id;
	
	@Column(name="NM_TIPO_HABILIDADE", length=50, nullable=false)
	private String nome;
	
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
	
}
