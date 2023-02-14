package Sample1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.QueryHint;

import com.mysql.cj.Query;

public class Gunn {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager f=e.createEntityManager();
	EntityTransaction t=f.getTransaction();
	javax.persistence.Query	d=f.createQuery("delete from Sunn");	
		 //Sunn s=new Sunn();
		 //s.setId(1);
          //s.setName("Sunil");
		 //s.setCity("bang");
		 //s.setPh_No(7676461843l);
		 
		 t.begin();
         d.executeUpdate();
		 t.commit();
	
		
	}

}
