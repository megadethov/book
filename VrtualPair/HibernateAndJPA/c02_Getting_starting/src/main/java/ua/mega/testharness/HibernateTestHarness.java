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

        Tutor tutor = new Tutor("ABC123", "Laura Bennet", 3247474);
        session.save(tutor);
        Student student = new Student("Name-1", "enroll-111");
        session.save(student);

        tutor.addStudentToSupervisionGroup(student);

        tx.commit();
        session.close();

        // second session
        session = sf.openSession();
        tx = session.beginTransaction();

        Tutor tutorFromDatabase = (Tutor) session.get(Tutor.class, 1);
        Set<Student> lauraStudents = tutorFromDatabase.getSupervisionGroup();

        for (Student next : lauraStudents) {
            System.out.println(next);
        }

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
