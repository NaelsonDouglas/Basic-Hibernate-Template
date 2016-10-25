package main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SEC_GRADUACAO")
public class SecGraduacao extends Secretaria {
	
	private int id;

	
	@Id
	@Column(name = "SEC_GRADUACAO_ID")
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	

}
