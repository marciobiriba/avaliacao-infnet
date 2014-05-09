package br.edu.infnet.dominio;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="AVALIACAO")
public class Avaliacao {
	@Id
	@Column(name="AVALIACAO_ALUNO_ID")
	private Integer id;
	@OneToMany(mappedBy="avaliacao")
	private Set<Questao> questoes;
	@Column(name = "DATA_CRIACAO")
	@Temporal(TemporalType.DATE)
	private Date dataCriacao;
	@Column(name = "DATA_PREENCHIMENTO")
	@Temporal(TemporalType.DATE)
	private Date dataPreenchimento;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Set<Questao> getQuestoes() {
		return questoes;
	}
	public void setQuestoes(Set<Questao> questoes) {
		this.questoes = questoes;
	}
}
