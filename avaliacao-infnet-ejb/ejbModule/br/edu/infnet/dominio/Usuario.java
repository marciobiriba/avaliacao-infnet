package br.edu.infnet.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="USUARIO")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="PERFIL", discriminatorType = DiscriminatorType.STRING)
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", nullable=false)
	private Integer id;
	@Column(name = "NOME", nullable=false)
	private String nome;
	@Column(name = "USERNAME", nullable=false)
	private String username;
	@Column(name = "SENHA", nullable=false)
	private String senha;
	@Column(name = "DATA_NASC", nullable=false)
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date nascimento;
	@Column(name = "CELULAR", nullable=false)
	private String celular;
	@Column(name = "IDIOMA", nullable=false)
	private String idioma;
	@Column(name = "ATIVO", nullable=false)
	private boolean ativo;
	
	//TODO Criar colunas nas tabelas

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
