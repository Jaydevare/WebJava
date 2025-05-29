package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Student;

public class StudentDAO
{
//	private static SessionFactory factory;
//	private static Session session;
//	
//	public static Session getSession()
//	{
//		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
//		session = factory.openSession();
//		return session;
//	}
//	
//	public static void closeSession()
//	{
//		session.close();
//		factory.close();
//	}
	
	public static int saveStudent(Student s)
	{
		SessionFactory factory =null;
		Session session = null;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			
			int id = (int)session.save(s);
			session.getTransaction().commit();
			return id;
		} catch (Exception e) {
			return 0;
		}finally {
			session.close();
			factory.close();
		}
	}
	
	public static List<Student> getAllStudents() 
	{
		SessionFactory factory =null;
		Session session = null;
		
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			
			Query query = session.createQuery("from Student");
			List<Student> l = query.list();
			return l;
		} catch (Exception e) {
			return null;
		}finally {
			session.close();
			factory.close();
		}
		
	}
	
	public static Student getStudentById(int id)
	{
		SessionFactory factory =null;
		Session session = null;
		
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			Student stud = session.get(Student.class, id);
			System.out.println(stud);
			System.out.println("======");
			return stud;
		} catch (Exception e) {
			return null;
		}finally {
			session.close();
			factory.close();
		}
	}
	
	public static int updateStudent(Student s) 
	{
		SessionFactory factory = null;
		Session session = null;
		int i = 0;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			session.update(s);
			
			System.out.println(s.getEmail());
			System.out.println(s.getFirstname());
			System.err.println(s.getId());
			session.getTransaction().commit();
			i = 1;
			return i;
		}catch (Exception e) {
			return 0;
		}finally {
			session.close();
			factory.close();
		}
	}
	
	public static int deleteStudent(int id)
	{
		SessionFactory factory = null;
		Session session = null;
		int i = 0;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			System.out.println(id);
			Student stu = session.get(Student.class, id);
			session.remove(stu);
			session.getTransaction().commit();
			i =1;
			return i;
		} catch (Exception e) {
			return 0;
		}finally {
			session.close();
			factory.close();
		}
	}
}
