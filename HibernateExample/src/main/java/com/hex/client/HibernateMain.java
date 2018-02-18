package com.hex.client;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.journaldev.hibernate.model.DBUser;
import com.journaldev.hibernate.model.Employee;
import com.journaldev.hibernate.util.HibernateUtil;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class HibernateMain {

	public static void main(String[] args) {

		// new HibernateMain().getDetails();
		// new HibernateMain().update(100, "karthick");
		new HibernateMain().delete(100);
	}

	public void insert() {
		DBUser user = new DBUser();

		user.setUserId(101);
		user.setUsername("superman");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());

		// Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		// start transaction
		session.beginTransaction();
		// Save the Model object

		session.save(user);
		// Commit transaction
		session.getTransaction().commit();
		System.out.println("Employee ID=" + user.getUserId());

		// terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}

	public void getDetails() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		List<DBUser> userList = (List) session.createQuery("FROM DBUser").list();
		System.out.println("*** Employee Details ***");
		for (DBUser user : userList) {
			System.out.println("Employee ID   : " + user.getUserId());
			System.out.println("Employee Name : " + user.getUsername());
			System.out.println("Employee Age  : " + user.getCreatedDate());
		}
		session.getTransaction().commit();
	}

	public void update(int id, String name) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		DBUser user = (DBUser) session.get(DBUser.class, id);
		user.setUsername(name);

		session.update(user);
		session.getTransaction().commit();
		System.out.println("user Updated!!!" + user.getUserId());
	}

	public void delete(int id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		DBUser user = (DBUser) session.get(DBUser.class, id);

		session.delete(user);
		session.getTransaction().commit();
		System.out.println("user Updated!!!" + user.getUserId());
	}

}
