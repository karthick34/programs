package com.hex.client;

import java.util.Date;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.journaldev.hibernate.model.DBUser2;
import com.journaldev.hibernate.util.HibernateUtil;

public class HibernateAnnotationClient {

	public static void main(String[] args) {
		new HibernateAnnotationClient().insert();
	}
	
	public void insert(){
		
		SessionFactory factory = HibernateUtil.getSessionAnnotationFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		
		DBUser2 dbUser2 = new DBUser2();
		dbUser2.setUsername("karthick");
		dbUser2.setCreatedBy("yogesh");
		dbUser2.setCreatedDate(new Date());
		
		session.save(dbUser2);
		
		session.getTransaction().commit();
		
		session.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
