package training.iqgateway.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactoryRef;
	
	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		sessionFactoryRef = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactoryRef;
	}
}
