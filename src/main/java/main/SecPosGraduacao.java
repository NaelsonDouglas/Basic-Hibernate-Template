package main;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SEC_POS_GRADUACAO")
public class SecPosGraduacao extends Secretaria {
	
	
	
	
	@Id
	@Column(name = "SEC_POS_GRADUACAO_ID")
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "SEC_POS_GRADUACAO_DISCIPLINA",
            joinColumns = @JoinColumn(name = "SEC_POS_GRADUACAO_ID"),
            inverseJoinColumns = @JoinColumn(name = "DISCIPLINA_ID")
    )
	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	
	
	
	
	
	
}
