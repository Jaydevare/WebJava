package com.app;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;


public class App 
{
    public static void main( String[] args )
    {
       Scanner sc = new Scanner(System.in);
       
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
       Session session = factory.openSession();
       session.beginTransaction();
       
		/*
		 * Instructor inst = new Instructor(); InstructorDetails instd = new
		 * InstructorDetails(); inst.setFirstName("Mayur"); inst.setLastName("Javare");
		 * inst.setEmail("javar@gamil.com"); instd.setYoutube_channel("Mayur.pp");
		 * instd.setHobby("Cricket"); inst.setInstructorDetails(instd);
		 * session.persist(inst);
		 */
		
//		 InstructorDetails instd = new InstructorDetails("jayRyuk","WWE"); Instructor inst = new
//		 Instructor("Jay","Devare","digvijay@gmail.com",instd); session.persist(inst);
		 
//       System.out.println("enter id");
//       int id = sc.nextInt();
//       Instructor instructor = session.get(Instructor.class, id);
//       System.out.println(instructor);
       
//       System.out.println("enter id");
//       int id = sc.nextInt();
//       Instructor instructor = session.get(Instructor.class, id);
//       instructor.setEmail("sumedh@gmail.com");
//       instructor.getInstructorDetails().setHobby("valoo");
//       Instructor i = session.merge(instructor);
//       System.out.println(i);
       
//       System.out.println("enter id");
//       int id = sc.nextInt();
//       Instructor instructor = session.get(Instructor.class, id);
//       session.remove(instructor);
       
//       session.createQuery("from Instructor").list().forEach(x -> System.out.println(x));
       
       List<Instructor> l = session.createQuery("from Instructor").list();
       
       java.util.function.Predicate<Instructor> p = x -> x.getInstructorDetails().getHobby().equals("Cricket");
       l.forEach(x -> {if(p.test(x)) {System.out.println(x);}});
       
       session.getTransaction().commit();
       session.close();
       factory.close();
    }
}
