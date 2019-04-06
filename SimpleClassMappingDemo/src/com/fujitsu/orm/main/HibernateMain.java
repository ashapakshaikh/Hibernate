package com.fujitsu.orm.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fujitsu.bins.Product;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create configuration
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
		
		//database operation  logic
		/*Product p=new Product();
		p.setName("laptop");
		p.setBrand("samsung");
		p.setPrice(450.00f);
		
		session.save(p);*/
		
		//2 get or load product
		/*Product p=session.get(Product.class,1200);
		System.out.println(p);
		*/
		/*if(p!=null)
		{
			p.setPrice(p.getPrice()+500.00f);
			session.update(p);
		}
		else
			System.out.println("product not found");&*if(p!=null)*/
		
		
		Product p=session.get(Product.class,4005);
		
			if(p!=null)
		{
			p.setPrice(p.getPrice()+500.00f);
			session.update(p);
		}
		else
			System.out.println("product not found");
		
		//commit transaction
		tx.commit();
		
		//close session-close database connection
		session.close();
	

	}

}
