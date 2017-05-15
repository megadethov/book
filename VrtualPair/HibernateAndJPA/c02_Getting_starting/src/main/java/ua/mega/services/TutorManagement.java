package ua.mega.services;

import ua.mega.domain.Tutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
* This is not production standard!
* We will be improving it, but for now it not
* be used on real code.
 */

public class TutorManagement {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");

    public Tutor createNewTutor(String staffId, String name, int salary) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Tutor newTutor = new Tutor(staffId, name, salary);
        em.persist(newTutor);

        // commit release any database connection
        tx.commit();
        em.close();
        return newTutor;
    }

    public Tutor updateTutor(Tutor tutorToUpdate) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // tutorToUpdate will be dirty

        tx.commit();
        em.close();
        return tutorToUpdate;
    }
}
