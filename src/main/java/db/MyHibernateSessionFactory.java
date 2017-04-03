package db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class MyHibernateSessionFactory {

	private static SessionFactory sessionFactory; // 会话工厂属性

	// 构造方法私有化，保证单例模式。
	private MyHibernateSessionFactory() {

	}

	// 共有静态方法，获得会话工厂对象
	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {

			Configuration configuration = new Configuration().configure();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
					.buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			return sessionFactory;

		} else {// 已经初始化过，直接返回该对象
			return sessionFactory;
		}
	}
}
