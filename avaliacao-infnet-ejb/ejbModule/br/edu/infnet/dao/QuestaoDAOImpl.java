package br.edu.infnet.dao;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import br.edu.infnet.dominio.Questao;

@Stateless
public class QuestaoDAOImpl extends  AbstractDAO<Questao> implements QuestaoDAO{
	private Logger log = Logger.getLogger(QuestaoDAOImpl.class.getName());
	public QuestaoDAOImpl(Class<Questao> entidade) {
		super(Questao.class);
		
	}

	@Override
	public Questao obterPorID(Integer id) {
		Questao questaoRetorno = null;
		try{
			questaoRetorno = (Questao) getEntityManager().createQuery("Select q from questao as q where q.ID = :IDQUESTAO")
			.setParameter("IDQUESTAO", id)
			.getSingleResult();
		}catch (NoResultException e){
			log.warning("Sem resultado metodo obterPorID: Questao");
		}
		return questaoRetorno;
	}

	
}
