package main;


import java.util.HashSet;
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

		
		 // loads configuration and mappings
        Configuration configuration = new Configuration().configure();
        ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
        registry.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
         
        // builds a session factory from the service registry
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         
        // obtains the session
        Session session = sessionFactory.openSession();
        session.beginTransaction();
         
        
		
		
		
		Disciplina disc1 = new Disciplina();
		disc1.setNome("abxxxxx");
		disc1.setMinCreditos(10);
		disc1.setObrigatoria(false);
		disc1.setOferecida(true);		
		
		Departamento dpt = new Departamento();
		Aluno aln = new Aluno();
		aln.setNome("zé");
		aln.setCresdsCumpridos(10);
		aln.setDepartamentoID(dpt);
		
		
		
		Set<Aluno> alunos = new HashSet<Aluno>();
		
		alunos.add(aln);
		
		
		Set<Disciplina> disciplinas = new HashSet<Disciplina>();
		disc1.setAlunos(alunos);
		disciplinas.add(disc1);		
		
		
		session.save(disc1);
		session.getTransaction().commit();
		session.close();
		
		
	}

}

