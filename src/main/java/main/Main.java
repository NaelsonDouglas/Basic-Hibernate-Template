package main;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.Position;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.PostgresPlusDialect;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {

		
		
        Session session = HibernateOPS.getSession(); //sessionFactory.openSession();
        session.beginTransaction();
         
        
		
		
		Secretaria pos = new SecPosGraduacao();
		Disciplina dc1 = new Disciplina();
		dc1.setNome("Historia");
		dc1.setMinCreditos(10);
		dc1.setObrigatoria(false);
		dc1.setOferecida(true);
		Set<Disciplina> disciplinas = new HashSet<Disciplina>();
		disciplinas.add(dc1);
		pos.setDisciplinas(disciplinas);		
		session.save(pos);
		
		List<Secretaria> list = session.createCriteria(Secretaria.class).list();         
           
		
		
		
		
		session.getTransaction().commit();
		session.close();
		
		
	}

}

