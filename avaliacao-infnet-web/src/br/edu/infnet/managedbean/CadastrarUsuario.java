package br.edu.infnet.managedbean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.edu.infnet.dao.UsuarioDAO;
import br.edu.infnet.dominio.Usuario;

@ManagedBean(name="MBCadastrarUsuario")
@RequestScoped
public class CadastrarUsuario {
	@Inject
	private Usuario Usuario;
	@EJB
	private UsuarioDAO usuarioDAO;
	
	public Usuario getUsuario() {
		return Usuario;
	}
	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}
	
	public void cadastrarUsuario(){
		FacesContext facesContext = FacesContext.getCurrentInstance();
		try{
			//TO DO
		}catch(Exception e){
			//TO DO
		}
	}
	
	
}
