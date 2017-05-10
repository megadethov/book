package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Subject;
import ua.mega.domain.Tutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HibernateTestHarness {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Tutor tutor = new Tutor("adc123", "Aaron", 18314243);
        em.persist(tutor);

        Student student1 = new Student("Student-1", "1-STD");
        em.persist(student1);
        Student student2 = new Student("Student-2", "2-STD");
        em.persist(student2);

        Subject subject = new Subject("Math", 2);
        em.persist(subject);
        Subject subject2 = new Subject("Science", 4);
        em.persist(subject2);

        Tutor tutor2 = new Tutor("xyz", "Ben", 283837);
        em.persist(tutor2);

        tutor.addSubjectToQualifications(subject);
        tutor.addSubjectToQualifications(subject2);
        tutor2.addSubjectToQualifications(subject2);

        tutor.addStudentToSupervisionGroup(student1);
        tutor.addStudentToSupervisionGroup(student2);

        tx.commit();
        em.close();
    }

}
