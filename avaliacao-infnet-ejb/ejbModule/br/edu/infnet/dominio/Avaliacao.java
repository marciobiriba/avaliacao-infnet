package br.edu.infnet.dominio;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AVALIACAO")
public class Avaliacao {
	@Id
	private Integer id;
	@OneToOne(mappedBy="avaliacao")
	private Aluno aluno;
	@OneToMany(mappedBy="avaliacao")
	private Set<Questao> questoes;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Set<Questao> getQuestoes() {
		return questoes;
	}
	public void setQuestoes(Set<Questao> questoes) {
		this.questoes = questoes;
	}
}
