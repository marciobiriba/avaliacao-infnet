package br.edu.infnet.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.edu.infnet.dominio.Usuario;
import br.edu.infnet.exception.RNException;
import br.edu.infnet.negocio.UsuarioDTOImpl;

@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private Usuario usuario = new Usuario();
	private List<Usuario> lista;
	private String confirmarSenha;
	private String destinoSalvar;
	private boolean autenticado = false;
	private String msgLoginErro = "Login ou Senha inválidos!";

	public String novo(){
		this.destinoSalvar = "usuarioSucesso";
		this.usuario = new Usuario();
		this.usuario.setAtivo(true);
		return "usuario";
	}

	public String editar(){
		this.confirmarSenha = this.usuario.getSenha();
		return "/publico/usuario";
	}

	public String salvar(){
		FacesContext context = FacesContext.getCurrentInstance();

		String senha = this.usuario.getSenha();
		if(!senha.equals(this.confirmarSenha)){
			FacesMessage facesMessage = new FacesMessage("A senha não foi confirmada corretamente");
			context.addMessage(null, facesMessage);
			return null;
		}
		UsuarioDTOImpl usuarioDTO = new UsuarioDTOImpl();
		usuarioDTO.salvar(this.usuario);
		return this.destinoSalvar;
	}
	public void efetuarLogin(ActionEvent actionEvent) {

		UsuarioDTOImpl usuarioDTO = new UsuarioDTOImpl();
		Usuario usuarioConsulta = usuarioDTO.buscarPorLogin(this.usuario.getLogin());
		String senha = this.usuario.getSenha();
		if(!senha.equals(usuarioConsulta.getSenha())){
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login ou Senha inválidos!" , null);
			FacesContext.getCurrentInstance().addMessage(null, message);
			autenticado = false;
			System.out.print(msgLoginErro);
		}else{
			autenticado = true;
		}

	}

	public String redirecionarLogin(){
		if(autenticado)
			return "avaliacao";
		return "login";	
	}

	public String excluir() throws RNException{
		UsuarioDTOImpl usuarioDTO = new UsuarioDTOImpl();
		usuarioDTO.excluir(this.usuario);
		this.lista = null;
		return null;
	}
	public String ativar(){
		if(this.usuario.isAtivo())
			this.usuario.setAtivo(false);
		else
			this.usuario.setAtivo(true);

		UsuarioDTOImpl usuarioDTO = new UsuarioDTOImpl();
		usuarioDTO.salvar(this.usuario);
		return null;
	}
	public Usuario getUsuario(){return usuario;}
	public void setUsuario(Usuario usuario){this.usuario =  usuario;}
	public String getConfirmarSenha(){return confirmarSenha;}
	public void setConfirmarSenha(String confirmarSenha){this.confirmarSenha = confirmarSenha;}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}
	public List<Usuario> getLista() {
		if(this.lista == null){
			UsuarioDTOImpl usuarioDTO = new UsuarioDTOImpl();
			this.lista = usuarioDTO.listar();
		}
		return this.lista;
	}
}
