package ua.mega.testharness;

import ua.mega.domain.Student;
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

       /* Tutor myTutor = new Tutor("111-VEN-ID", "Veniamin Vladimirivich", 10000);
        em.persist(myTutor);

        myTutor.createStudentAndAddToSupervisionGroup("Vasya Pupkin", "PUP-293");
        myTutor.createStudentAndAddToSupervisionGroup("Petya Petrov", "PET-293");
        myTutor.createStudentAndAddToSupervisionGroup("Ivan Ivanov", "IVA-293");

        Set<Student> students = myTutor.getSupervisionGroup();
        System.out.println(students.size());*/

        Tutor tutor = em.find(Tutor.class, 1);
        em.remove(tutor);

        tx.commit();
        em.close();
    }
}
