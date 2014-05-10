package br.edu.infnet.negocio;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.edu.infnet.dao.AvaliacaoDAO;
import br.edu.infnet.dominio.Avaliacao;
import br.edu.infnet.dominio.Questao;

/**
 * Session Bean implementation class AvaliacaoDTOImpl
 */
@Stateless
public class AvaliacaoDTOImpl implements AvaliacaoDTO{

	@EJB
	private AvaliacaoDAO avaliacaoDAO;
    /**
     * Default constructor. 
     */
    public AvaliacaoDTOImpl() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public void adcionarQuestao(Questao obterQuestaoSelecionada) {
		avaliacaoDAO.adcionarQuestao(obterQuestaoSelecionada);
		
	}
	@Override
	public void cadastrar(Avaliacao avaliacao) {
		avaliacaoDAO.cadastrar();
		
	}
	@Override
	public void preencherAvaliacao() {
		avaliacaoDAO.preencherAvaliacao();
		
	}

}
