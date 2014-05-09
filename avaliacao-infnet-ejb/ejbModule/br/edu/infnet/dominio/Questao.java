package br.edu.infnet.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="questao")
public class Questao {
	@Id
	@Column(name = "ID")
	private Integer id;
	@Column(name = "DESCRICAO")
	private String descricao;
	@ManyToOne
	@PrimaryKeyJoinColumn(name="QUESTAO_AVALIACAO_ID", referencedColumnName="AVALIACAO_ID")
	private Avaliacao avaliacao;
	@Column(name = "LIKERT")
	@Enumerated(EnumType.STRING)
	private Likert likert;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Likert getLikert() {
		return likert;
	}

	public void setLikert(Likert likert) {
		this.likert = likert;
	}

}
