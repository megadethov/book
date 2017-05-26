package ua.mega.testharness;

import ua.mega.domain.Student;
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

        Tutor myTutor = new Tutor("111-VEN-ID", "Veniamin Vladimirivich", 10000);
        em.persist(myTutor);
        Student myStudent = new Student("Vasya", "VAS-101");
        em.persist(myStudent);
        Student myStudent2 = new Student("Petya", "PET-273");
        em.persist(myStudent2);
        Student myStudent3 = new Student("Vova", "VOV-387");
        em.persist(myStudent3);

        myTutor.addStudentToSupervisionGroup(myStudent);
        myTutor.addStudentToSupervisionGroup(myStudent2);
        myTutor.addStudentToSupervisionGroup(myStudent3);

        System.out.println(myTutor.getSupervisionGroup().size());

        tx.commit();
        em.close();
    }
}
