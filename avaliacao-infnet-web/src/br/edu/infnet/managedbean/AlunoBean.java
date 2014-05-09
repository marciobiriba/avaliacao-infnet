package br.edu.infnet.managedbean;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import br.edu.infnet.dominio.Aluno;
import br.edu.infnet.negocio.AlunoDTO;

@ManagedBean
@SessionScoped
public class AlunoBean {
	
	@EJB
	private AlunoDTO alunoDto;
	private Aluno aluno = new Aluno();
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public void cadastrarAluno(){
		alunoDto.cadastrar(aluno);	
	}
	public Aluno buscarPorLogin(String login){
		return (Aluno) alunoDto.buscarPorLogin(login);
	}
}
