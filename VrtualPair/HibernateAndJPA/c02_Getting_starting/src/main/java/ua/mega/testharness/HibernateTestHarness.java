package ua.mega.testharness;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import ua.mega.domain.Student;
import ua.mega.domain.Tutor;

public class HibernateTestHarness {

    private static SessionFactory sessionFactory = null;

    public static void main(String[] args) {
        // save the student to the database

        SessionFactory sf = getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

       /* Student myStudent = new Student ("Alicia Coutts");
        Tutor newTutor = new Tutor("DEF456", "Michael Jung", 939383);
        session.save(myStudent);
        session.save(newTutor);
        // make the student be supervised by that tutor
        myStudent.allocateSupervisor(newTutor);
        // print out the supervisor
        System.out.println(myStudent.getSupervisorName());*/

        Student foundStudent = (Student) session.get(Student.class, 1);
        System.out.println(foundStudent);

        Tutor supervisor = (Tutor) session.get(Tutor.class, 2);

        foundStudent.allocateSupervisor(supervisor);

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
