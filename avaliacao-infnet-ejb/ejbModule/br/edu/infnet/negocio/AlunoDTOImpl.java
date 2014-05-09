package br.edu.infnet.negocio;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.edu.infnet.dao.AlunoDAO;
import br.edu.infnet.dominio.Aluno;
import br.edu.infnet.dominio.Avaliacao;

@Stateless
public class AlunoDTOImpl implements AlunoDTO{
	
	@EJB
	private AlunoDAO alunoDao;
	
	public AlunoDTOImpl(AlunoDAO alunoDao) {
		super();
		this.alunoDao = alunoDao;
	}
	

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void preencherAvaliacao(Aluno aluno) {
		Avaliacao avaliacao = alunoDao.obterAvaliacao(aluno.getAvaliacao());
		
	}	
	
}
