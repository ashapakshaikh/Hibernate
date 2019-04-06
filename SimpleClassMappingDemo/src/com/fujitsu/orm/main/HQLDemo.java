package com.fujitsu.orm.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fujitsu.bins.Product;

public class HQLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();

		//read hibernate property from hibernate .cfg.xml and store in sessionfactory
		Configuration c=cfg.configure();

		//obtain sessionfactory through configuration
		SessionFactory factory=c.buildSessionFactory();

		//get session from sessionfactory
		//represents database connection
		Session session=factory.openSession();

		//get transcation through session
		Transaction tx=session.beginTransaction();
		/*
		Query query=session.createQuery("from Product");
		List<Product> products=query.getResultList();
		products.forEach(p->System.out.println(p));*/
		/*
		Query query=session.createQuery("select p.name,p.price from Product p");
		List<Object[]> rows=query.getResultList();
		for(Object colDate[]:rows)
		{
			//System.out.println(colDate[0]+""+colDate[1]);
			for(object colValue:colDate[])
			
				System.out.println();
		}
		
*/
		//Query query=session.createQuery("from Product p order by p.price desc");
	//	Query query=session.createQuery("from Product p order by p.price between 30000 to 50000");
		//Query query=session.createQuery("from Product p where p.brand like'l%'");
		//Query query=session.createQuery("from Product p where  p.brand like 'r_'");
		/*List<Product> products=query.getResultList();
		products.forEach(p->System.out.println(p));*/
	/*	
		Query query=session.createQuery("select p.brand,count(*) from Product p group by p.product");
		int noofRows=(int) query.getSingleResult();
		System.out.println("No of rows:"+noofRows);
		
				*/
		
		
		Query query=session.createQuery("select max(p.price)from Product p");
		float max=(float) query.getSingleResult();
		System.out.println("No of rows:"+max);
		
		
		//commit transaction
		tx.commit();

		//close session-close database connection
		session.close();


	}

}
