package FirstHibernate.com.myhib.CRUDS;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import administrativo.Departamento;
import administrativo.Departamento4;
import administrativo.Disciplina;
import administrativo.Secretaria;
import pessoal.Aluno;
import pessoal.Pessoa;
import pessoal.Professor;

public class CrudsOps {

	public static void main(String[] args) {
			
		
	



















		SessionFactory factory = new Configuration().configure().buildSessionFactory();	
		org.hibernate.Session session = factory.openSession();		
		Transaction t =  (Transaction) session.beginTransaction();
		
		
		//session.save(p);
		//session.getTransaction().commit();				
		
		Professor a = new Professor();
		a.setMatricula(10);
		a.setNome("satã");
		
		session.save(a);
		session.getTransaction().commit();
		
		Query query = session.createQuery("from Professor");		
		System.out.println(query.list().size());
		
		List<Pessoa>  users =   query.list();
		
		for (Pessoa temp : users){
			System.out.println(temp.getNome());
		}
		//------
		
		
		session = factory.openSession();
		
		
		Secretaria sec = new Secretaria();
		sec.setDisciplinas(1);
		sec.setId(2);
		
		
		//Departamento4 d = new Departamento4();
		//d.setId(14);
		//d.setSecGraduacao_id(sec);
		
		
		session.save(sec);
		session.getTransaction().begin();
		session.getTransaction().commit();
		
		
		
		
		
		
		
		
		
		
		session.close();
		
         
      		
			
	}

}
