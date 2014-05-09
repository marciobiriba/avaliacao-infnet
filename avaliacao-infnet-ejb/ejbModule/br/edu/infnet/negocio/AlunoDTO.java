package br.edu.infnet.negocio;

import java.util.List;

import javax.ejb.Local;

import br.edu.infnet.dominio.Aluno;
import br.edu.infnet.dominio.Avaliacao;
import br.edu.infnet.dominio.Usuario;

@Local
public interface AlunoDTO{
	
	void cadastrar(Usuario usuario);

	void salvar(Usuario usuario);

	Usuario buscarPorLogin(String login);

	void excluir(Usuario usuario);

	List<Usuario> listar();
	
	Avaliacao preencherAvaliacao(Aluno aluno);

}
