package br.edu.infnet.negocio;

import javax.ejb.Local;

import br.edu.infnet.dominio.Aluno;

@Local
public interface AlunoDTO{
	
	void preencherAvaliacao(Aluno aluno);

}
