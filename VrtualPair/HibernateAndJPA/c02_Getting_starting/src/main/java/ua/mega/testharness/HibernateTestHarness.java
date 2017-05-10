package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Subject;
import ua.mega.domain.Tutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Set;

public class HibernateTestHarness {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Tutor t1 = new Tutor("adc123", "Aaron", 18314243);
        em.persist(t1);

        t1.createNewStudentAndAddToSupervisorGroup("Student-1", "1-STD");
        t1.createNewStudentAndAddToSupervisorGroup("Student-2", "2-STD");

        Set<Student> students = t1.getSupervisionGroup();
        System.out.println(students.size());

        tx.commit();
        em.close();
    }

}
