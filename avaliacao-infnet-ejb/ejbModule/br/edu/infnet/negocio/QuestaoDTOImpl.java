package br.edu.infnet.negocio;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.edu.infnet.dao.QuestaoDAO;
import br.edu.infnet.dominio.Questao;

@Stateless
public class QuestaoDTOImpl implements QuestaoDTO{

	@EJB
	private QuestaoDAO questaoDAO;
	public void cadastrar(Questao questao) {
		questaoDAO.cadastrar(questao);
		
	}
	@Override
	public Questao obterPorID(Integer id) { 
		return questaoDAO.obterPorID(id);
	}

}
