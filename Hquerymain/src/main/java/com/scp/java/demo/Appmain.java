package com.scp.java.demo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Appmain {
	
	public static Configuration config = new Configuration().configure("mysql.cfg.xml").addAnnotatedClass(Student.class);
	public static StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
	public static SessionFactory sf = config.buildSessionFactory(reg);

	public static void main(String[] args) {
  
//		Student stud1 = new Student(1,"Rajesh",50);
//		Student stud2 = new Student(2,"Raj",60);
//		Student stud3 = new Student(3,"Rajeshwar",88);
//		Student stud4 = new Student(4,"Ramesh",55);
//		Student stud5 = new Student(5,"Sham",78);
//		Student stud6 = new Student(6,"Manoj",67);
//		Student stud7 = new Student(7,"Vishal",90);
		
		Session session = sf.openSession();
		
		Transaction tr =  session.beginTransaction();
//		
//        session.save(stud1);
//        session.save(stud2);
//        session.save(stud3);
//        session.save(stud4);
//        session.save(stud5);
//        session.save(stud6);
//        session.save(stud7);
      
		//NameQuery(HQL)
		//Query q = session.createQuery("from Student where studMarks > 80");//(case:1)
		//List<Student> students = q.getResultList();
		//System.out.println("List of Student :"+students);
		//OR
//		for (Student s : students)
//		{
//			System.out.println(s);
//		}
		
		
//		Query q = session.createQuery("from Student where studID = 7");//(case:2)
//		Student student = (Student)q.getSingleResult();
//		System.out.println(student);
		
		 
//        Query q = session.createQuery("select studID,studName,studMarks from Student where studID = 3");//(case:3)
//        Object[] student = (Object[])q.getSingleResult();
//        for(Object o : student) {
//        	System.out.println(o);
//        }
    //OR
 //       System.out.println(student[0]+":"+student[1]+":"+student[2]);
        
		
	//	Query q = session.createQuery("select studID,studName,studMarks from Student");//(case:4)
//		Query q = session.createQuery("select studID,studName,studMarks from Student s where s.studMarks > 80");//(case:5)
//		List<Object[]> students = (List<Object[]>)q.getResultList();
//		for(Object[] student : students){
//			System.out.println(student[0]+":"+student[1]+":"+student[2]);
//		}
		
		
		Query q = session.createQuery("select sum(studMarks) from Student s where studMarks > 40");//(case:6)
		Long marks = (Long)q.getSingleResult();
		System.out.println("=>"+marks);
		
		session.flush();
		tr.commit();
		
	}
}   
