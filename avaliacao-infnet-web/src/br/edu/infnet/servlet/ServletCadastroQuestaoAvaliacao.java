package br.edu.infnet.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.dominio.Avaliacao;
import br.edu.infnet.dominio.Questao;
import br.edu.infnet.negocio.AvaliacaoDTO;
import br.edu.infnet.negocio.QuestaoDTO;

/**
 * Servlet implementation class ServletCadastroQuestao
 */
@WebServlet("/ServletCadastroQuestao")
public class ServletCadastroQuestaoAvaliacao extends HttpServlet {
	@EJB
	private QuestaoDTO questaoDTO;
	private AvaliacaoDTO avaliacaoDTO;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCadastroQuestaoAvaliacao() {
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
		Questao questao = new Questao();
		Set<Questao> questoes = null;
		Avaliacao avaliacao = new Avaliacao();
		//CADASTRA QUESTAO
		questao.setDescricao("Você gosta da Infnet?");
		questaoDTO.cadastrar(questao);
		//ADCIONA QUESTAO A AVALIACAO
		questoes.add(questao);		
		avaliacao.setQuestoes(questoes);
		//CADASTRA AVALIACAO
		avaliacaoDTO.cadastrar(avaliacao);
		avaliacaoDTO.adcionarQuestao(questaoDTO.obterPorID(questao.getId()));
		//USUARIO PREENCHE AVALIACAO
		avaliacaoDTO.preencherAvaliacao();
		
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCadastrar</title>");            
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
