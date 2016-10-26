package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateOPS {
	
	public static Session getSession(){
		// loads configuration and mappings
	    Configuration configuration = new Configuration().configure();
	    ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
	    registry.applySettings(configuration.getProperties());
	    ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
	     
	    // builds a session factory from the service registry
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	     
	    // obtains the session
	    Session session = sessionFactory.openSession();
	    return session;
	    
		
	}
	

}
