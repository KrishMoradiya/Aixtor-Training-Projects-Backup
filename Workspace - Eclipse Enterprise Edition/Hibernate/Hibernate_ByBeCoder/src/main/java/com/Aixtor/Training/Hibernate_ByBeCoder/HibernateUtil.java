package com.Aixtor.Training.Hibernate_ByBeCoder;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration configure = new Configuration();
			Properties properties = new Properties();
			
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/student");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "root");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			properties.put(Environment.SHOW_SQL, true);
			
			configure.setProperties(properties);
			configure.addAnnotatedClass(TBLStudent.class);
//			configure.addAnnotatedClass(TBLFaculty.class);
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configure.getProperties()).build();
			sessionFactory = configure.buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
	}
}
