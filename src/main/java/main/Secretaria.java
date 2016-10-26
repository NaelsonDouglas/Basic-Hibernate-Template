package main;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

public class Secretaria {

	protected int id;
	protected Set<Disciplina> disciplinas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
	public Disciplina getDisciplina(int index){
		Session session = HibernateOPS.getSession();
		session.beginTransaction();
		List<Secretaria> list = session.createCriteria(Secretaria.class,1).list();		
		return list.get(index);
	}
	
	
	

	
	
	

}
