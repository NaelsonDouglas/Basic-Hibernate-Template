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

@Entity
@Table(name = "SEC_GRADUACAO")
public class SecGraduacao extends Secretaria {
	
	private int id;
	private Set<Disciplina> disciplinas;
	
	@Id	
	@Column(name = "SEC_GRADUACAO_ID")
	@GeneratedValue
	public int getId() {
		return id;
	}
	@OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "SEC_GRADUACAO_DISCIPLINA",
            joinColumns = @JoinColumn(name = "SEC_GRADUACAO_ID"),
            inverseJoinColumns = @JoinColumn(name = "DISCIPLINA_ID")
    )
	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	
	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
	
	
	

}
