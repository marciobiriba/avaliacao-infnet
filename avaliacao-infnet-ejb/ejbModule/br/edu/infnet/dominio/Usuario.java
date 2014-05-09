package br.edu.infnet.dominio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@MappedSuperclass
@Entity
@Table(name="usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="PERFIL", discriminatorType = DiscriminatorType.STRING)
public abstract class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "USER_ID", nullable=false)
	private Integer id;
	@Column(name = "NOME", nullable=false)
	private String nome;
	@Column(name = "USERNAME", nullable=false)
	private String username;
	@Column(name = "SENHA", nullable=false)
	private String senha;
	@Column(name = "EMAIL", nullable=false)
	private String email;
	@Column(name = "IDIOMA", nullable=false)
	private String idioma;
	@Column(name = "ATIVO", nullable=false)
	private boolean ativo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ALUNO_USUARIO", referencedColumnName="ID")
	private Aluno aluno;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ADMINISTRADOR_USUARIO", referencedColumnName="ID")
	private Administrador administrador;
	
	//TODO Criar colunas nas tabelas

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

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

	public String getEmail() {
		return email;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
