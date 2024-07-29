package training.iqgateway.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import training.iqgateway.entities.DepartmentEO;

public class HibernateUtil {
	private static final SessionFactory sessionFactoryRef;
	
	static {
		// if you want to use hibernate.properties
		
	//	Configuration cfg = new Configuration();
	//	cfg.addClass(DepartmentEO.class);
	//	sessionFactoryRef = cfg.buildSessionFactory();
		
		//If you want to use hibernate.cfg.xml
		Configuration cfg = new Configuration();
		cfg.configure();
		sessionFactoryRef = cfg.buildSessionFactory();
		
		// If you have changed the configuration file name[myhibernateconfig.xml]
//		Configuration cfg = new Configuration();
//		cfg.configure("myhibernateconfig.xml");
//		sessionFactoryRef = cfg.buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactoryRef;
	}
}
