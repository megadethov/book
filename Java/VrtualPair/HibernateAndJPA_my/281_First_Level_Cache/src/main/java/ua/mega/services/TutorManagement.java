package ua.mega.services;

import ua.mega.domain.Tutor;

import javax.persistence.*;
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

    /**
     * Note: this method will only return Tutor data.
     * Please, don't try to access the students(subjects)
     */
    public Tutor findTutorById(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Tutor tutor = em.find(Tutor.class, id);

        tx.commit();
        em.close();

        return tutor;
    }

    // return a Tutor and their supervisionGroup
    public Tutor findTutorByIdWithSupervisionGroup(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

       Tutor findTutor = (Tutor) em.createQuery("select tutor from Tutor as tutor left join fetch tutor.supervisionGroup where tutor.id = :id")
                .setParameter("id", id)
                .getSingleResult();

        tx.commit();
        em.close();

        return findTutor;
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

        /*List<Object[]> result = em.createQuery("select tutor.name, tutor.salary from Tutor as tutor").getResultList();
        for (Object[] next : result) {
            System.out.println(next[0] + "---" + next[1]);
        }*/

        List<Object[]> result = em.createQuery("select tutor.name, tutor.salary from Tutor as tutor")
                .setLockMode(LockModeType.PESSIMISTIC_READ)
                .getResultList();
        for (Object[] next : result) {
            System.out.println(next[0] + "---" + next[1]);
        }

        long totalSalary = (Long) em.createQuery("select sum(tutor.salary) from Tutor as tutor").getSingleResult();

        System.out.println("Total salary is: " + totalSalary);

        tx.commit();
        em.close();
    }

    public void inMemoryQuery(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Tutor tutor = em.find(Tutor.class, id);

        // if here other process something change in DB
        // This does not concern us, because we work with in memory Object

        tutor.setSalary(20000);

        tx.commit();em.close();
    }

}


