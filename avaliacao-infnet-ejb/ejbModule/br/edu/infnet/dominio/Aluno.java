package br.edu.infnet.dominio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value="ALUNO")
public class Aluno extends Usuario{
	
	@OneToOne
	@PrimaryKeyJoinColumn(name="ALUNO_AVALIACAO_ID", referencedColumnName="AVALIACAO_ID")
	private Avaliacao avaliacao;
	@Column(name="TURMA")
	private String turma;
	
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

}
