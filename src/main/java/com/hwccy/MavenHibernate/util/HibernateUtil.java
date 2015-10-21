package com.hwccy.MavenHibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static Configuration configuration;
	private static SessionFactory sessionFactory;
	static{
		configuration=new Configuration().configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder serviceRegistryBuilder=
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry=serviceRegistryBuilder.build();
		sessionFactory=configuration.buildSessionFactory(serviceRegistry);
	}
	public static Configuration getConfiguration() {
		return configuration;
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
}
