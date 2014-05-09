package br.edu.infnet.dominio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ADMIN")
public class Administrador extends Usuario{
	
	@Column(name="MATR_FUNC")
	private String matriculaFuncionario;
	@Column(name="SETOR")
	private String setor;

	public String getMatriculaFuncionario() {
		return matriculaFuncionario;
	}

	public void setMatriculaFuncionario(String matriculaFuncionario) {
		this.matriculaFuncionario = matriculaFuncionario;
	}
	
}
