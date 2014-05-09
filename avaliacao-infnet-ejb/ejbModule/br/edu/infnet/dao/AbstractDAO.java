package br.edu.infnet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

public abstract class AbstractDAO<T> {
private Class<T> entidade;
	
	@PersistenceContext(unitName = "avaliacao-infnet")
	private EntityManager em;
	
	protected EntityManager getEntityManager(){
		return this.em;
	}
	
	public AbstractDAO(Class<T> entidade) {
        this.entidade = entidade;
    }
	
	public void cadastrar(T entidade){
		getEntityManager().persist(entidade);
	}
	
	public void alterar(T entidade){
		getEntityManager().merge(entidade);
	}
	
	public void excluir(T entidade){
		getEntityManager().remove(getEntityManager().merge(entidade));
	}
	
	public T obterPorId(Integer id){
		return getEntityManager().find(entidade, id);
	}
	
	public List<T> listar(){
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entidade));
        return getEntityManager().createQuery(cq).getResultList();
    }
	/*public List consulta(){
    	return em.createNativeQuery("Select p from Pedido where p.idProduto = :IDPROD")
    		.setParameter("IDPROD", "1")
    		.setMaxResults(50)
    		.getResultList();
    }*/

}
