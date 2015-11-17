package kz.kazntu.lessons.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SessionFactor {
    private final static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        Configuration configuration = new Configuration();
        configuration.configure() ;

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .buildServiceRegistry() ;

        return configuration.buildSessionFactory(serviceRegistry) ;
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory ;
    }
}
