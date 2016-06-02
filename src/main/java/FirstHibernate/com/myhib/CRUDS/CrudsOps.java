package FirstHibernate.com.myhib.CRUDS;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class CrudsOps {

	public static void main(String[] args) {
			
SessionFactory factory = new Configuration().configure().buildSessionFactory();	
		
		Session session = factory.openSession();		
		
		
		Transaction t =  (Transaction) session.beginTransaction();
		
		Contacts p = new Contacts();		
		p.setId(3);
		p.setFname("Naelson basssss");
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
		
         
      		
			
	}

}
