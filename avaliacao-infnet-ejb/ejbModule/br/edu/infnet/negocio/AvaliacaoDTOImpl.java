package br.edu.infnet.negocio;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.edu.infnet.dao.AvaliacaoDAO;

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

}
