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

       /* Student myStudent = new Student ("Alicia Coutts");
        Tutor newTutor = new Tutor("DEF456", "Michael Jung", 939383);
        session.save(myStudent);
        session.save(newTutor);
        // make the student be supervised by that tutor
        myStudent.allocateSupervisor(newTutor);
        // print out the supervisorTUTOR_STUDENT
        System.out.println(myStudent.getSupervisorName());*/
        Tutor newTutor = new Tutor("ABC844", "Adrian Nathan", 282424721);

        Student student1 = new Student("Rebecca Soni", "1-SON-2012");
        Student student2 = new Student("Zou Kai", "2-ZOU-2009");
        Student student3 = new Student("Chris Hoy", "3-HOY-1997");

        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(newTutor);

        newTutor.addStudentToSupervisionGroup(student1);
        newTutor.addStudentToSupervisionGroup(student2);
        newTutor.addStudentToSupervisionGroup(student3);

        //Init Many-to-one relation
        student1.allocateSupervisor(newTutor);
        System.out.println(student1.getSupervisorName());
        student2.allocateSupervisor(newTutor);
        System.out.println(student2.getSupervisorName());
        student3.allocateSupervisor(newTutor);
        System.out.println(student3.getSupervisorName());

        //Init One-to-many relation
        Tutor myTutor = (Tutor) session.get(Tutor.class, 1);
        Set<Student> students = myTutor.getSupervisionGroup();

        for (Student next : students) {
            System.out.println(next);
        }

        // test out a couple of subjects
        Subject subject1 = new Subject("Math", 2);
        Subject subject2 = new Subject("Science", 4);

        session.save(subject1);
        session.save(subject2);

        newTutor.addSubjectToQualifications(subject1);
        newTutor.addSubjectToQualifications(subject2);
        subject1.addTutorToSubject(newTutor);
        subject2.addTutorToSubject(newTutor);

        Tutor secondTutor = new Tutor("GHT23637", "Ben Ainsli", 3852638);
        session.save(secondTutor);

        secondTutor.addSubjectToQualifications(subject2);
        subject2.addTutorToSubject(secondTutor);

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
