package FirstHibernate.com.myhib.CRUDS;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class CrudsOps {

	public static void main(String[] args) {
			
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		
		System.out.println("Configurations ran");
		Session session = sf.openSession();
		session.beginTransaction();
		System.out.println("Transaction began");
		
		
		
	
        
        Contacts cont = new Contacts();
        cont.setId(2);
        cont.setFname("naelson_hib");
        cont.setLname("douglas_hibernate");
         
        //Save the employee in database
        session.save(cont);
 
        //Commit the transaction
        session.getTransaction().commit();
		
			
	}

}
