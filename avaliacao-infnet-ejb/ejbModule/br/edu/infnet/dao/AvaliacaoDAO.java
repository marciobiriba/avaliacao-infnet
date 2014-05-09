package br.edu.infnet.dao;

import javax.ejb.Local;

import br.edu.infnet.dominio.Avaliacao;

@Local
public interface AvaliacaoDAO {

	Avaliacao obterQuestoes(Avaliacao avaliacao);
	
}
