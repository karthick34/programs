package com.journaldev.hibernate.main;

import java.util.Date;

import org.hibernate.Session;

import com.journaldev.hibernate.model.DBUser;
import com.journaldev.hibernate.model.Employee;
import com.journaldev.hibernate.util.HibernateUtil;

public class HibernateMain {

	public static void main(String[] args) {
		DBUser user = new DBUser();

		user.setUserId(101);
		user.setUsername("superman");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());
		
		//Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//start transaction
		session.beginTransaction();
		//Save the Model object
		session.save(user);
		//Commit transaction
		session.getTransaction().commit();
		System.out.println("Employee ID="+user.getUserId());
		
		//terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}

}
