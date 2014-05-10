package br.edu.infnet.dao;

import javax.ejb.Local;

import br.edu.infnet.dominio.Questao;

@Local
public interface QuestaoDAO {

	public void cadastrar(Questao questao);

	public Questao obterPorID(Integer id);

}
