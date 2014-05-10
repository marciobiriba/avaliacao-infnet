package br.edu.infnet.dao;

import javax.ejb.Local;

import br.edu.infnet.dominio.Avaliacao;
import br.edu.infnet.dominio.Questao;

@Local
public interface AvaliacaoDAO {

	Avaliacao obterQuestoes(Questao obterQuestaoSelecionada);

	void adcionarQuestao(Questao obterQuestaoSelecionada);

	void cadastrar();

	void preencherAvaliacao();
	
}
