package main;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
@Table(name = "DISCIPLINA")
public class Disciplina {
	
	private long id;
	private String nome;
	private int minCreditos;
	//private Disciplina prerequisitos;
	private boolean obrigatoria;
	private boolean oferecida;
	private Set<Aluno>alunos;
	
	
	
	
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
	
	@Column(name ="MIN_CREDITOS")
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
	
	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "DISCIPLINA_ALUNO",
	        joinColumns = @JoinColumn(name = "DISCIPLINA_ID"),
	        inverseJoinColumns = @JoinColumn(name = "ALUNO_ID")
	)
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
