package ua.mega.testharness;

import ua.mega.domain.Subject;
import ua.mega.domain.Tutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PerformanceTesting {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");

    public static void main(String[] args)
    {
        setUpData();
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Tutor tutor = em.find(Tutor.class, 1); // Here Hibernate don't load Student and use Proxy Object
        System.out.println(tutor.getName() + "---" + tutor.getSalary());

       /* int numberOfStudents = tutor.getSupervisionGroup().size(); // Here Hibernate load Student
        System.out.println("This Tutor have " + numberOfStudents + " students");*/

        tx.commit();
        em.close();

        // LazyInitializationException
        int numberOfStudents = tutor.getSupervisionGroup().size(); // Here Hibernate load Student
        System.out.println("This Tutor have " + numberOfStudents + " students");
    }

    public static void setUpData()
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // Some subjects
        Subject mathematics = new Subject("Mathematics", 2);
        Subject science = new Subject("Science", 2);
        Subject history = new Subject("History", 3);
        em.persist(mathematics);
        em.persist(science);
        em.persist(history);

        // This tutor will be very busy, with lots of students
        Tutor t1 = new Tutor("ABC123", "David Banks", 2939393);
        t1.addSubjectToTutor(mathematics);
        t1.addSubjectToTutor(science);

        // This tutor is new and has no students
        // But he will be able to teach science and mathematics
        Tutor t2 = new Tutor("DEF456", "Alan Bridges", 0);
        t2.addSubjectToTutor(mathematics);
        t2.addSubjectToTutor(science);

        // This tutor is the only tutor who can teach History
        Tutor t3 = new Tutor("GHI678", "Linda Histroia", 0);
        t3.addSubjectToTutor(history);

        em.persist(t1);
        em.persist(t2);
        em.persist(t3);

        // this only works because we are cascading from tutor to student
        t1.createStudentAndAddToSupervisionGroup("Marco Fortes", "1-FOR-2010", "1 The Street", "Anytown", "484848");
        t1.createStudentAndAddToSupervisionGroup("Kath Grainer", "2-GRA-2009", "2 Kaths Street", "Georgia", "939393");
        t3.createStudentAndAddToSupervisionGroup("Sandra Perkins", "3-PER-2009", "4 The Avenue", "Georgia", "939393");

        tx.commit();
        em.close();
    }
}
