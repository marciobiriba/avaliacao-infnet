package br.edu.infnet.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;

@Entity
@DiscriminatorValue(value="ALUNO")
public class Aluno extends Usuario{

	@OneToOne
	@PrimaryKeyJoinColumn(name="ALUNO_AVALIACAO_ID", referencedColumnName="AVALIACAO_ID")
	private Avaliacao avaliacao;
	@Column(name="TURMA")
	private String turma;
	@Column(name="MATRICULA")
	private Integer matricula;
	@Column(name = "DATA_NASC", nullable=false)
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date nascimento;
	@Column(name = "CELULAR", nullable=false)
	private String celular;
	
	
	
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public String getTurma() {
		return turma;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public String getCelular() {
		return celular;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

}
