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

public class HibernateTestHarness {

    private static SessionFactory sessionFactory = null;

    public static void main(String[] args) {

        SessionFactory sf = getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Tutor myTutor = new Tutor("111-STF-ID", "TutorName-1", 10000);
        Tutor myTutor2 = new Tutor("222-STF-ID", "TutorName-2", 12000);
        Subject mySubject = new Subject("History");
        Subject mySubject2 = new Subject("Math");
        session.save(myTutor);
        session.save(myTutor2);
        session.save(mySubject);
        session.save(mySubject2);

        myTutor.addSubjectToTutor(mySubject);
        mySubject2.addTeacherToSubject(myTutor2);

        tx.commit(); // SQL execute here
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
