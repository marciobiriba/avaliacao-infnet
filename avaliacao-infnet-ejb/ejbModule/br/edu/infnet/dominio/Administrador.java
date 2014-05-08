package br.edu.infnet.dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ADMIN")
public class Administrador extends Usuario{
	
	
}
