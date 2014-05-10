package br.edu.infnet.negocio;

import javax.ejb.Local;

import br.edu.infnet.dominio.Avaliacao;
import br.edu.infnet.dominio.Questao;

@Local
public interface AvaliacaoDTO {

	void adcionarQuestao(Questao obterQuestaoSelecionada);

	void cadastrar(Avaliacao avaliacao);

	void preencherAvaliacao();

}
