package br.edu.infnet.dao;

import javax.ejb.Local;

import br.edu.infnet.dominio.Administrador;

@Local
public interface AdministradorDAO {

	void cadastrar(Administrador administrador);

}
