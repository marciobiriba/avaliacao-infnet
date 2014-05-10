package br.edu.infnet.negocio;

import java.util.Set;

import javax.ejb.Local;

import br.edu.infnet.dominio.Administrador;
import br.edu.infnet.dominio.Aluno;

@Local
public interface AdministradorDTO {
	
	void cadastrar(Administrador administrador);
	
	void salvar(Administrador administrador);
	
	void excluir(Administrador administrador);
	
	Set<Administrador> listar();
	
	void cadastrarAluno(Aluno aluno);

}
