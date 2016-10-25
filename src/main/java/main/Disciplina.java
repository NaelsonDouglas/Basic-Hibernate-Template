package main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DISCIPLINA")
public class Disciplina {
	
	private long id;
	private String nome;
	private int minCreditos;
	//private Disciplina prerequisitos;
	private boolean obrigatoria;
	private boolean oferecida;
	//private Aluno matriculados;
	
	
	
	
	@Id
	@Column(name = "DISCIPLINA_ID")
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMinCreditos() {
		return minCreditos;
	}
	public void setMinCreditos(int minCreditos) {
		this.minCreditos = minCreditos;
	}
	public boolean isObrigatoria() {
		return obrigatoria;
	}
	public void setObrigatoria(boolean obrigatoria) {
		this.obrigatoria = obrigatoria;
	}
	public boolean isOferecida() {
		return oferecida;
	}
	public void setOferecida(boolean oferecida) {
		this.oferecida = oferecida;
	}

	
	
}
