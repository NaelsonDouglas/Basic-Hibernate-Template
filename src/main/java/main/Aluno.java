package main;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ALUNO")
public class Aluno {
	
	private long id;		
	private Departamento departamentoID;	
	private int cresdsCumpridos;
	
	
	
	
	
	
	
	@Id
	@Column(name = "ALUNO_ID")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPARTAMENTO_ID")
	public Departamento getDepartamentoID() {
		return departamentoID;
	}
	public void setDepartamentoID(Departamento departamentoID) {
		this.departamentoID = departamentoID;
	}
	
	
	@Column(name = "CREDS_CUMPRIDOS")
	public int getCresdsCumpridos() {
		return cresdsCumpridos;
	}
	public void setCresdsCumpridos(int cresdsCumpridos) {
		this.cresdsCumpridos = cresdsCumpridos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
