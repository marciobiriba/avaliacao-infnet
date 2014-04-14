package br.edu.infnet.dao;

import javax.ejb.Stateless;

import br.edu.infnet.dominio.Usuario;

@Stateless
public class UsuarioDAOImpl extends AbstractDAO<Usuario> implements UsuarioDAO{

	public UsuarioDAOImpl() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
