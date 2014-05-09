package br.edu.infnet.dao;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import br.edu.infnet.dominio.Aluno;
import br.edu.infnet.dominio.Avaliacao;

@Stateless
public class AlunoDAOImpl extends AbstractDAO<Aluno> implements AlunoDAO{
	
	private Logger log = Logger.getLogger(AlunoDAOImpl.class.getName());
	public AlunoDAOImpl(Class<Aluno> entidade) {
		super(Aluno.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Avaliacao obterAvaliacao(Avaliacao avaliacao) {
		Avaliacao avaliacaoRetorno = null;
		try{
			avaliacaoRetorno = (Avaliacao) getEntityManager().createQuery("Select a.avaliacao from Aluno")
					.getSingleResult();
		}catch(NoResultException e){
			log.warning("Sem resultado!");
		}
		return avaliacaoRetorno;
	}
	
}
