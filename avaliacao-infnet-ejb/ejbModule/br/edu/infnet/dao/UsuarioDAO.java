package br.edu.infnet.dao;

import javax.ejb.Local;

import br.edu.infnet.dominio.Usuario;

@Local
public interface UsuarioDAO {

	void cadastrar(Usuario usuario);

}
