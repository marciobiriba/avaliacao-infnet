package br.edu.infnet.dao;

import java.util.logging.Logger;

import javax.ejb.Stateless;

import br.edu.infnet.dominio.Avaliacao;

/**
 * Session Bean implementation class AvaliacaoDAOImpl
 */
@Stateless
public class AvaliacaoDAOImpl extends AbstractDAO<Avaliacao> implements AvaliacaoDAO {
	
	private Logger log = Logger.getLogger(AvaliacaoDAOImpl.class.getName());
    /**
     * Default constructor. 
     */
    public AvaliacaoDAOImpl() {
        super(Avaliacao.class);
    }
	public Logger getLog() {
		return log;
	}
	public void setLog(Logger log) {
		this.log = log;
	}
	@Override
	public Avaliacao obterQuestoes(Avaliacao avaliacao) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
