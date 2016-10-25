package main;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PROFESSOR")
public class Professor extends Pessoa {
	
		
	
	@Id
	@Column(name = "PROFESSOR_ID")
	@GeneratedValue
	public long getId() {
		return id;
	}
	
	@Column(name = "NOME")
	public String getNome() {
		return nome;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPARTAMENTO_ID")
	public Departamento getDepartamentoID() {
		return departamentoID;
	}
	
	
	
	
	
	
	
	

}
