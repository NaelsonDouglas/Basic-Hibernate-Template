package FirstHibernate.com.myhib.CRUDS;

import java.util.List;

<<<<<<< HEAD
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
=======
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

>>>>>>> ab06cfd3286c38712a045a36cb750825862aa177

public class CrudsOps {

	public static void main(String[] args) {
<<<<<<< HEAD
			
SessionFactory factory = new Configuration().configure().buildSessionFactory();	
=======
		
		

		SessionFactory factory = new Configuration().configure().buildSessionFactory();	
>>>>>>> ab06cfd3286c38712a045a36cb750825862aa177
		
		Session session = factory.openSession();		
		
		
		Transaction t =  (Transaction) session.beginTransaction();
		
		Contacts p = new Contacts();		
		p.setId(3);
<<<<<<< HEAD
		p.setFname("Naelson Douglasasdasd");
=======
		p.setFname("Naelson Douglas");
>>>>>>> ab06cfd3286c38712a045a36cb750825862aa177
		p.setLname("Douglas2");		
		
		session.save(p);
		session.getTransaction().commit();
		
		
		Query query = session.createQuery("from Contacts");		
		System.out.println(query.list().size());
		
		List<Contacts>  users =   query.list();
		
		for (Contacts temp : users){
			System.out.println(temp.getFname());
		}
		
		
		
		session.close();
		
<<<<<<< HEAD
         
      		
			
=======
		
		
		
>>>>>>> ab06cfd3286c38712a045a36cb750825862aa177
	}

}
