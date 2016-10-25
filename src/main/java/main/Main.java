package main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
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
         
        
		System.out.println("ok");
		
		
		
		Aluno aln = new Aluno();
		aln.setCresdsCumpridos(500);
		
		Departamento dpt = new Departamento();
		SecPosGraduacao posGrad = new SecPosGraduacao();
		SecGraduacao grad = new SecGraduacao();
		dpt.setGraduacao(grad);
		dpt.setPosGraduacao(posGrad);
		
		aln.setDepartamentoID(dpt);
		
		
		
		session.save(aln);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
