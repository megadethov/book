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

import java.util.Set;

public class HibernateTestHarness {

    private static SessionFactory sessionFactory = null;

    public static void main(String[] args) {

        SessionFactory sf = getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Tutor myTutor = new Tutor("111-VEN-ID", "Veniamin Vladimirivich", 10000);
        Student myStudent = new Student("Vasya", "VAS-101");
        Student myStudent2 = new Student("Petya", "PET-273");
        Student myStudent3 = new Student("Vova", "VOV-387");

        myTutor.addStudentToSupervisionGroup(myStudent);
        myTutor.addStudentToSupervisionGroup(myStudent2);
        myTutor.addStudentToSupervisionGroup(myStudent3);

        // it's a legal Hibernate to save here
        session.save(myTutor);
        session.save(myStudent);
        session.save(myStudent2);
        session.save(myStudent3);

        tx.commit();
        session.close();

        // read collections of students from DB
        session = sf.openSession();
        tx = session.beginTransaction();

        Tutor getTutor = (Tutor) session.get(Tutor.class, 1);
        Set<Student> students = getTutor.getSupervisionGroup();

        System.out.println(students.size()); // expected=3, actual=1;

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
