package com.Aixtor.Training.StudentHibernate;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import java.lang.module.Configuration;

//import com.mysql.cj.xdevapi.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Hibernate!!!" );
        StudentTB student = new StudentTB();
//        student.setId(1);
//        student.setStudentID("22MCA001");
//        student.setName("Himanshu");
//        student.setCourse("MCA");
        
//        student = new StudentTB(2,"22MCA002","Bhavy","Msc.It.");
//        student = new StudentTB(3,"22MCA003","Shani","MCA");
        student = new StudentTB(4,"22MCA004","Vishv","B.Com.");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(StudentTB.class);
        
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        session.save(student);
        tr.commit();
    }
}
