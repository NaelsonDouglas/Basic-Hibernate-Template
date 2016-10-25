package main;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento{
	private long id;
	private String nome;
	private SecGraduacao graduacao;
	private SecPosGraduacao posGraduacao;
	
	
	
	
	@Id
	@Column(name = "DEPARTAMENTO_ID")
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SEC_GRADUACAO_ID")
	public SecGraduacao getGraduacao() {
		return graduacao;
	}
	public void setGraduacao(SecGraduacao graduacao) {
		this.graduacao = graduacao;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SEC_POS_GRADUACAO_ID")
	public SecPosGraduacao getPosGraduacao() {
		return posGraduacao;
	}
	public void setPosGraduacao(SecPosGraduacao posGraduacao) {
		this.posGraduacao = posGraduacao;
	}
	
	
	@Column(name = "NOME")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
