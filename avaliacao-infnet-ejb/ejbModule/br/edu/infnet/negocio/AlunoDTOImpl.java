package br.edu.infnet.negocio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.edu.infnet.dao.AlunoDAO;
import br.edu.infnet.dominio.Aluno;
import br.edu.infnet.dominio.Avaliacao;
import br.edu.infnet.dominio.Usuario;

@Stateless
public class AlunoDTOImpl implements AlunoDTO{
	
	@EJB
	private AlunoDAO alunoDao;
	
	public AlunoDTOImpl(AlunoDAO alunoDao) {
		super();
		this.alunoDao = alunoDao;
	}
	

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Avaliacao preencherAvaliacao(Aluno aluno) {
		Avaliacao avaliacao = alunoDao.obterAvaliacao(aluno.getAvaliacao());
		return avaliacao;
	}


	@Override
	public void cadastrar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Aluno buscarPorLogin(String login) {
		Aluno aluno = alunoDao.obterUsername(login);
		return aluno;
	}


	@Override
	public void excluir(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
