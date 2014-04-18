package br.edu.infnet.managedbean;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.edu.infnet.negocio.UsuarioDTO;
import br.edu.infnet.dominio.Usuario;

@ManagedBean
public class CadastrarUsuario {
	
	private String nome;
	private String login;
	private String senha;
	private String perfil;
	private Date nascimento;
	private String celular;
	private String idioma;
	private boolean ativo;
	private String email;

	@EJB
	private UsuarioDTO usuarioDto;
	
	public void cadastrarUsuario(){
		Usuario usuario = new Usuario();

		usuario.setNome(nome);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setPerfil(perfil);
		usuario.setNascimento(nascimento);
		usuario.setCelular(celular);
		usuario.setIdioma(idioma);
		usuario.setAtivo(ativo);
		usuario.setEmail(email);
		
		usuarioDto.cadastrar(usuario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UsuarioDTO getUsuarioDto() {
		return usuarioDto;
	}

	public void setUsuarioDto(UsuarioDTO usuarioDto) {
		this.usuarioDto = usuarioDto;
	}
	
	
}
