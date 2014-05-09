package br.edu.infnet.dao;

import javax.ejb.Local;

import br.edu.infnet.dominio.Aluno;
import br.edu.infnet.dominio.Avaliacao;

@Local
public interface AlunoDAO {

	Avaliacao obterAvaliacao(Avaliacao avaliacao);

	Aluno obterUsername(String login);

}
