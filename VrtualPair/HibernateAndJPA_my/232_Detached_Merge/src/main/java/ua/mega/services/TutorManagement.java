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
//        em.persist(myTutor);

//        ID>=1 => update()
//        ID=0 => insert()
        myTutor = em.merge(myTutor); // instead persist()

        // commit realise any DB conn
        tx.commit();
        // close will detach the tutor
        em.close();

        return myTutor;
    }

    public Tutor updateTutor(Tutor tutorToUpdate) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // make the object be dirty checked again
        tutorToUpdate = em.merge(tutorToUpdate); // don't forget re-assign!!!

        // dirty check
        tx.commit();
        em.close();

        return tutorToUpdate;
    }

}


