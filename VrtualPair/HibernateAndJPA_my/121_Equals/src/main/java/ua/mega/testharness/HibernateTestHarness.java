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
        session.save(myTutor);
        session.save(myStudent);

        myStudent.allocateSupervisor(myTutor);

        System.out.println(myStudent.getSupervisorName());

        tx.commit(); // SQL execute here
        session.close();

        // Second Session
        session = sf.openSession();
        tx = session.beginTransaction();

        Tutor getTutor = (Tutor) session.get(Tutor.class, 1);
        Set<Student> students = getTutor.getSupervisionGroup();

        for (Student next : students) {
            System.out.println(next);
            System.out.println("=========================================");
        }
        System.out.println(students.contains(myStudent));


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
