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
		
		Material p = new Material();		
		p.setId(3);
		p.setBrand("Naelson basssss");
		p.setSize(10);		
		session.save(p);
		session.getTransaction().commit();
		
		
		
		Query query = session.createQuery("from Material");		
		System.out.println(query.list().size());
		
		List<Material>  users =   query.list();
		
		for (Material temp : users){
			System.out.println(temp.getBrand());
		}
		
		
		
		session.close();
		
         
      		
			
	}

}
