package com.app;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

public class App1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//1 add 
//		Instructor inst = new Instructor("Mayur","Javare","mayur@gmail.com");
//		InstructorDetails instd = new InstructorDetails("cricket", "RS45.org", inst);
//		inst.setInstructorDetails(instd);
//		session.persist(instd);
		
//		Instructor inst = new Instructor();
//		InstructorDetails instd = new InstructorDetails();
//		inst.setFirstName("Chaitanya");
//		inst.setLastName("Avhad");
//		inst.setEmail("chaitu@gmail.com");
//		instd.setHobby("pubg");
//		instd.setYoutube_channel("chaitu.org");
//		instd.setInstructor(inst);
//		inst.setInstructorDetails(instd);
//		session.persist(instd);
		
//		System.out.println("enter id ");
//		int id = sc.nextInt();
//		InstructorDetails instd = session.get(InstructorDetails.class, id);
//		System.out.println(instd);
		
//		System.out.println("enter id ");
//		int id = sc.nextInt();
//		InstructorDetails instd = session.get(InstructorDetails.class, id);
//		instd.setYoutube_channel("ayushmaniac.org");
//		instd.getInstructor().setFirstName("Ayush");
//		instd.getInstructor().setLastName("Deshmukh");
//		instd.getInstructor().setEmail("ayush@gamil.com");
//		session.merge(instd);
		
//		System.out.println("enter id ");
//		int id = sc.nextInt();
//		InstructorDetails instd = session.get(InstructorDetails.class, id);
//		session.remove(instd);
		
		session.createQuery("from InstructorDetails").list().forEach(x -> System.out.println(x));
		
		Query q = session.createQuery("from InstructorDetails");
		List<InstructorDetails> l = q.list();
		Predicate<InstructorDetails> p = x -> x.getInstructor().getFirstName().equals("Chaitanya");
		l.forEach(x ->{if(p.test(x)) {System.out.println(x);}});
		
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
