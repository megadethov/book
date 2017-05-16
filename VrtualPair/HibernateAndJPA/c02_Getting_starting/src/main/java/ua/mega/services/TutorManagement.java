package ua.mega.services;

import ua.mega.domain.Tutor;

import javax.persistence.*;
import java.util.List;

/*
* This is not production standard!
* We will be improving it, but for now it not
* be used on real code.
 */

public class TutorManagement {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");

    // STEP 1
    public Tutor createNewTutor(String staffId, String name, int salary) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Tutor newTutor = new Tutor(staffId, name, salary);

        // LOCK THE TUTOR

        em.persist(newTutor);

        // commit release any database connection
        tx.commit();

        // close will detach the tutor
        em.close();
        return newTutor;
    }

    // Note: this method will only return Tutor data. Please don't
    // try to access the students (subjects)
    public Tutor findTutorById(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Tutor foundTutor = em.find(Tutor.class, id);

        tx.commit();
        em.close();

        return foundTutor;
    }

    // returns a tutor AND their associated supervision group
    public Tutor findTutorByIdWithSupervisionGroup(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Tutor foundTutor = (Tutor) em.createQuery("select tutor From Tutor as tutor join fetch tutor.supervisionGroup where tutor.id=:id")
                .setParameter("id", id)
                .getSingleResult();

        tx.commit();
        em.close();

        return foundTutor;
    }

    // STEP 2
    public Tutor updateTutor(Tutor tutorToUpdate) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // make the object be dirty checked again
        tutorToUpdate = em.merge(tutorToUpdate);

        // UNLOCK THE TUTOR

        // dirty check
        tx.commit();
        em.close();
        return tutorToUpdate;
    }

    // this method will give the name and salarys of every tutor in the college, with their salary
    // a summary at the end with the total salary bill for the whole college.
    public void generateReport() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        List<Object[]> namesAndSalarys = em.createQuery("select tutor.name, tutor.salary from Tutor as tutor")
                .setLockMode(LockModeType.PESSIMISTIC_WRITE)
                .getResultList();

        for (Object[] next : namesAndSalarys) {
            System.out.println(next[0] + " : " + next[1]);
        }

        long totalSalary = (long) em.createQuery("select sum(tutor.salary) from Tutor as tutor").getSingleResult();
        System.out.println("Total college salary is: " + totalSalary);

        tx.commit();
        em.close();
    }
}
