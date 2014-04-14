package br.edu.infnet.negocio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.edu.infnet.dao.UsuarioDAO;
import br.edu.infnet.dominio.Usuario;

@Stateless
public class UsuarioDTOImpl implements UsuarioDTO{
	@EJB
	private UsuarioDAO usuarioDAO;
	@Override
	public void cadastrar(Usuario usuario) {
		usuarioDAO.cadastrar(usuario);		
	}
	@Override
	public void salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Usuario buscarPorLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void excluir(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
