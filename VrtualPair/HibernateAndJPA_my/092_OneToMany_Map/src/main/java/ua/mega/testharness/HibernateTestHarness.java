package ua.mega.testharness;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import ua.mega.domain.Student;
import ua.mega.domain.Tutor;

import java.util.Map;

public class HibernateTestHarness {

    private static SessionFactory sessionFactory = null;

    public static void main(String[] args) {

        SessionFactory sf = getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

       /* Student myStudent = new Student("StudentName-2");
        Tutor myTutor = new Tutor("222-STF", "TutorName-2", 10000);

        session.save(myStudent);
        session.save(myTutor);

        // make the student be supervised by the tutor
        myStudent.allocateSupervisor(myTutor);
        // sout the Tutor name
        System.out.println("Tutor name is: " + myStudent.getSupervisorName());*/

       /* Tutor tutor = new Tutor("111-STF", "nameTut-1", 10000);

        Student student1 = new Student("nameSt-1", "101-ENRID");
        Student student2 = new Student("nameSt-2", "102-ENRID");
        Student student3 = new Student("nameSt-3", "103-ENRID");

        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(tutor);

        tutor.addStudentToSupervisionGroup(student1);
        tutor.addStudentToSupervisionGroup(student2);
        tutor.addStudentToSupervisionGroup(student3);*/

        Tutor foundTutor = (Tutor) session.get(Tutor.class, 1);
        Map<String, Student> students = foundTutor.getSupervisionGroup();

        System.out.println(students.get("102-ENRID"));

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
