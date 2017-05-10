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

        SessionFactory sf = getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Tutor tutor = new Tutor("adc123", "Aaron", 18314243);
        session.save(tutor);

        Student student1 = new Student("Student-1", "1-STD");
        session.save(student1);
        Student student2 = new Student("Student-2", "2-STD");
        session.save(student2);

        Subject subject = new Subject("Math", 2);
        session.save(subject);
        Subject subject2 = new Subject("Science", 4);
        session.save(subject2);

        Tutor tutor2 = new Tutor("xyz", "Ben", 283837);
        session.save(tutor2);

        tutor.addSubjectToQualifications(subject);
        tutor.addSubjectToQualifications(subject2);
        tutor2.addSubjectToQualifications(subject2);

        tutor.addStudentToSupervisionGroup(student1);
        tutor.addStudentToSupervisionGroup(student2);

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
