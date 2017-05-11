package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Subject;
import ua.mega.domain.Tutor;

import javax.persistence.*;
import java.util.List;

public class HibernateTestHarness {

    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");

    public static void main(String[] args) {
        setUpData();
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // let's do some queries!

        Query q = em.createQuery("from Tutor as tutor join tutor.supervisionGroup as student where student.address.city = 'Georgia' ");
        List<Object[]> results = q.getResultList();

        for (Object[] next : results){
            System.out.println(next[0] + "-------" + next[1]);
        }

        tx.commit();
        em.close();
    }

    public static void setUpData() {
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
        t1.addSubjectToQualifications(mathematics);
        t1.addSubjectToQualifications(science);

        // This tutor is new and has no students
        // But he will be able to teach science and mathematics
        Tutor t2 = new Tutor("DEF456", "Alan Bridges", 0);
        t2.addSubjectToQualifications(mathematics);
        t2.addSubjectToQualifications(science);

        // This tutor is the only tutor who can teach History
        Tutor t3 = new Tutor("GHI678", "Linda Histroia", 0);
        t3.addSubjectToQualifications(history);

        em.persist(t1);
        em.persist(t2);
        em.persist(t3);

        // this only works because we are cascading from tutor to student
        t1.createNewStudentAndAddToSupervisorGroup("Marco Fortes", "1-FOR-2010", "1 The Street", "Anytown", "484848");
        t1.createNewStudentAndAddToSupervisorGroup("Kath Grainer", "2-GRA-2009", "2 Kaths Street", "Georgia", "939393");
        t3.createNewStudentAndAddToSupervisorGroup("Sandra Perkins", "3-PER-2009", "4 The Avenue", "Georgia", "939393");

        tx.commit();
        em.close();
    }

}
