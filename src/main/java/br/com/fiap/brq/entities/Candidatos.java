package br.com.fiap.brq.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="candidatos")
public class Candidatos implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/* CONSTRUCTOR */
	
	public Candidatos() { }
	
	/* PROPERTIES */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_CANDIDATO")
	private Long id;
	
	@Column(name="NM_CANDIDATO", length=100, nullable=false)
	private String nome;
	
	@Column(name="NR_CPF", length=18, nullable=false)
	private String cpf;
	
	@Column(name="NR_CELULAR", length=11, nullable=false)
	private Long celular;
	
	@Enumerated(EnumType.STRING)
	@Column(name="CD_SEXO", length=1, nullable=false)
	private Sexo sexo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO", nullable=false)
	private Date dataNascimento;
	
	@Column(name="DS_EMAIL", length=100, nullable=false)
	private String email;
	
	@ManyToMany
	@JoinTable(
	    name="CANDIDATO_CERTIFICACAO", 
	    joinColumns={ @JoinColumn(name="ID_CANDIDATO") }, 
	    inverseJoinColumns={ @JoinColumn(name="ID_CERTIFICACAO") }
	)
	private Set<Certificacoes> certificacoes;
	
	@ManyToMany
	@JoinTable(
	    name="CANDIDATO_HABILIDADE", 
	    joinColumns={ @JoinColumn(name="ID_CANDIDATO") }, 
	    inverseJoinColumns={ @JoinColumn(name="ID_HABILIDADE") }
	)
	private Set<Habilidades> habilidades;
	
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Certificacoes> getCertificacoes() {
		return certificacoes;
	}

	public void setCertificacoes(Set<Certificacoes> certificacoes) {
		this.certificacoes = certificacoes;
	}

	public Set<Habilidades> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Set<Habilidades> habilidades) {
		this.habilidades = habilidades;
	}
	
}
