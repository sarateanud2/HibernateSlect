package com.hibernate.select.main;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hibernate.select.models.Students;
import com.hibernate.select.utils.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query<Students> hql = session.createQuery("from Students");
		
		List<Students> studentsList = hql.list();
		
		for (Students student : studentsList) {
			System.out.println("Name: " + student.getName());
			System.out.println("Secondname: " + student.getSecondName());
			System.out.println("Age: " + student.getAge());
			System.out.println("Year: " + student.getYear());
		}
		
		
		session.getTransaction().commit();
		session.close();

	}

}
