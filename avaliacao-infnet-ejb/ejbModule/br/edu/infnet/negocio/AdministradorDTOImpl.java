package br.edu.infnet.negocio;

import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.edu.infnet.dao.AdministradorDAO;
import br.edu.infnet.dominio.Administrador;
import br.edu.infnet.dominio.Aluno;

@Stateless
public class AdministradorDTOImpl implements AdministradorDTO{
	@EJB
	private AdministradorDAO administradorDAO;
	
	@Override
	public void cadastrar(Administrador administrador) {
		administradorDAO.cadastrar(administrador);
		
	}

	@Override
	public void salvar(Administrador administrador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Administrador administrador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Administrador> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cadastrarAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		
	}

}
