package br.edu.infnet.negocio;

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

}
