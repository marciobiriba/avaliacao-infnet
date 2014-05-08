package br.edu.infnet.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="QUESTAO")
public class Questao {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "descricao")
	private String descricao;
	@ManyToOne
	@PrimaryKeyJoinColumn(name="QUESTAO_AVALIACAO_ID", referencedColumnName="AVALIACAO_ID")
	private Avaliacao avaliacao;

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

}
