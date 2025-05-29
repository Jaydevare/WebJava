package com.app;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Student;



public class App {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		//add student
		/*
		 * Student s = new Student(); s.setFirstname("Sumedh");
		 * s.setLastname("Loharikar"); s.setEmail("sumedh@gmail.com"); session.save(s);
		 */
		//view student by id
		/*
		 * int id; System.out.println("Enter Student ID : "); id = sc.nextInt(); Student
		 * stu = session.get(Student.class, id); System.out.println(stu);
		 */
		//update student
		/*
		 * int id; System.out.println("Enter Student ID : "); id = sc.nextInt(); Student
		 * stu = session.get(Student.class, id); stu.setLastname("Javare");
		 */
		
		//delete student
//		int id;
//		System.out.println("Enter id to delete student");
//		id = sc.nextInt();
//		Student stu = session.get(Student.class, id);
//		session.remove(stu);
		//display all student
//		Query query = session.createQuery("from Student");
//		List<Student> l = query.list();
//		l.forEach(x -> System.out.println(x));
		
		//dislay by parameter
		Query query = session.createQuery("from Student where lastname = :name");
		query.setParameter("name", "Loharikar");
		List<Student> l = query.list();
		l.forEach(x -> System.out.println(x));
		
		session.getTransaction().commit();
		
		session.close();
		
		factory.close();
		
		
	}
}