package br.edu.infnet.servlet;

import java.io.IOException;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.dominio.Usuario;
import br.edu.infnet.negocio.UsuarioDTO;

/**
 * Servlet implementation class CadastrarUsuarioTeste
 */
@WebServlet("/CadastrarUsuarioTeste")
public class CadastrarUsuarioTeste extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private UsuarioDTO usuarioDTO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarUsuarioTeste() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processaCadastro(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	public void processaCadastro(HttpServletRequest request, HttpServletResponse response){
		Usuario usuarioCadastro = new Usuario();
		usuarioCadastro.setNome("Usuário Teste");
		usuarioCadastro.setAtivo(true);
		usuarioCadastro.setCelular("9999-9999");
		usuarioCadastro.setIdioma("pt_BR");
		usuarioCadastro.setLogin("teste");
		usuarioCadastro.setNascimento(new Date(System.currentTimeMillis()));
		usuarioCadastro.setSenha("teste");
		
	}

}
