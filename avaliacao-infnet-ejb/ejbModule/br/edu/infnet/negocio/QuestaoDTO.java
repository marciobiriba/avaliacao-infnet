package br.edu.infnet.negocio;

import javax.ejb.Local;

import br.edu.infnet.dominio.Questao;

@Local
public interface QuestaoDTO {
	void cadastrar(Questao questao);
	Questao obterPorID(Integer id);

}
