package br.edu.infnet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.dominio.Administrador;
import br.edu.infnet.negocio.AdministradorDTO;

/**
 * Servlet implementation class ServletCadastroAluno
 */
@WebServlet("/ServletCadastroAluno")
public class ServletCadastroAdministrador extends HttpServlet {
	@EJB
	private AdministradorDTO administradorDTO;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCadastroAdministrador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		Administrador administrador = new Administrador();
		administrador.setUsername("marcio.biriba");
		administrador.setNome("Marcio");
		administrador.setEmail("marcio.biriba@gmail.com");
		administrador.setSenha("******");
		administrador.setAtivo(true);
		administradorDTO.cadastrar(administrador);
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cadastrar Administrador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Cadastrado!!!");
            out.println("<h1>Servlet ServletCadastrar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
