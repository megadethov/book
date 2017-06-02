package ua.mega.services;

import ua.mega.domain.Tutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * not fo production style
 */

public class TutorManagement {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");

    public Tutor createTutor(String stuffId, String name, int salary) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Tutor myTutor = new Tutor(stuffId, name, salary);
        em.persist(myTutor);

        tx.commit();
        em.close();

        return myTutor;
    }
}
