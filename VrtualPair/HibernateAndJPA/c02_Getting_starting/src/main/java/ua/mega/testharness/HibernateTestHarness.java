package ua.mega.testharness;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import ua.mega.domain.Student;
import ua.mega.domain.Subject;
import ua.mega.domain.Tutor;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class HibernateTestHarness {

    private static SessionFactory sessionFactory = null;

    public static void main(String[] args) {
        // save the student to the database

        SessionFactory sf = getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Tutor t1 = new Tutor("ABC123", "David Banks", 2939393);
        session.save(t1);

        Student s1 = new Student("Marco Fortes", "1-FOR-2010");
        session.save(s1);
        t1.addStudentToSupervisionGroup(s1);

        Student s2 = new Student("Luke Adams", "2-ADA-2009");
        session.save(s2);
        t1.addStudentToSupervisionGroup(s2);

        Student s3 = new Student("Angie Bainbridge", "3-BAI-2008");
        session.save(s3);
        t1.addStudentToSupervisionGroup(s3);

        System.out.println(t1.getSupervisionGroup().size()); // =3, not 1 now

        tx.commit();
        session.close();
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure();

            ServiceRegistry serviceRegistry = new
                    ServiceRegistryBuilder().applySettings(configuration.getProperties())
                    .buildServiceRegistry();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}
