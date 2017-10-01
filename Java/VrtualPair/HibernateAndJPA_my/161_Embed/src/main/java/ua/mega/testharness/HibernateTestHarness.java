package ua.mega.testharness;

import ua.mega.domain.Address;
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

//        Tutor myTutor = new Tutor("111-VEN-ID", "Veniamin Vladimirivich", 10000);
//        em.persist(myTutor);
//        myTutor.createStudentAndAddToSupervisionGroup("Vasya Pupkin", "PUP-293", "City-1", "Street-1", "871010");
//        myTutor.createStudentAndAddToSupervisionGroup("Petya Petrov", "PET-293", "City-2", "Street-2", "3982727");

//        Student studentFromDb = new Student("Ben Rotvell", "735-BEN");
//        em.persist(studentFromDb);

        Student studentFromDb = em.find(Student.class, 3);

        if (studentFromDb.getAddress() == null) {
            studentFromDb.setAddress(new Address("DefaultCity", "DefaultStreet", "182938"));
        }

        System.out.println(studentFromDb);

        tx.commit();
        em.close();
    }
}
