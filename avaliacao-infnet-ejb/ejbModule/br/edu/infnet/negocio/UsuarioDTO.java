package br.edu.infnet.negocio;

import javax.ejb.Local;

import br.edu.infnet.dominio.Usuario;

@Local
public interface UsuarioDTO {
	void cadastrar(Usuario usuario);

}
