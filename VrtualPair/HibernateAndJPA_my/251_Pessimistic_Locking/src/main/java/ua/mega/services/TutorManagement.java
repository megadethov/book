package ua.mega.services;

import ua.mega.domain.Tutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

/**
 * not to production style
 */

public class TutorManagement {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");

    // STEP1
    public Tutor createTutor(String stuffId, String name, int salary) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Tutor myTutor = new Tutor(stuffId, name, salary);

        // Lock the Tutor
        em.persist(myTutor);

        // commit realise any DB conn
        tx.commit();
        // close will detach the tutor
        em.close();

        return myTutor;
    }

    public Tutor findTutorById(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Tutor tutor = em.find(Tutor.class, id);

        tx.commit();
        em.close();

        return tutor;
    }

    // STEP2
    public Tutor updateTutor(Tutor tutorToUpdate) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // make the object be dirty checked again
        tutorToUpdate = em.merge(tutorToUpdate); // don't forget re-assign!!!

        // dirty check

        // Unlock the Tutor
        tx.commit();
        em.close();

        return tutorToUpdate;
    }

    public void generateReport() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        List<Object[]> result = em.createQuery("select tutor.name, tutor.salary from Tutor as tutor").getResultList();
        for (Object[] next : result) {
            System.out.println(next[0] + "---" + next[1]);
        }

        tx.commit();
        em.close();
    }

}


