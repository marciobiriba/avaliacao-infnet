package br.edu.infnet.dao;

import javax.ejb.Stateless;

import br.edu.infnet.dominio.Administrador;

@Stateless
public class AdministradorDAOImpl extends AbstractDAO<Administrador> implements AdministradorDAO{

	public AdministradorDAOImpl(Class<Administrador> entidade) {
		super(Administrador.class);

	}
	
}
