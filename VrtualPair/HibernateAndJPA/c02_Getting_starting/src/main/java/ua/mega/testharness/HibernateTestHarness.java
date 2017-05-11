package ua.mega.testharness;

import ua.mega.domain.Address;
import ua.mega.domain.Student;
import ua.mega.domain.Subject;
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

//        Tutor t1 = new Tutor("adc123", "Aaron", 18314243);
//        em.persist(t1);

//        t1.createNewStudentAndAddToSupervisorGroup("Student-1", "1-STD", "1 The Street", "Anytown-1", "1112233");
//        t1.createNewStudentAndAddToSupervisorGroup("Student-2", "2-STD", "2 The Street", "Anytown-2", "23624786");

//        Student student = new Student("Dmitriy Peters", "1-PET-2011");
//        em.persist(student);

        Student studentFromDatabase = em.find(Student.class, 1);
        System.out.println(studentFromDatabase);

        if (studentFromDatabase.getAddress() == null) {
            studentFromDatabase.setAddress(new Address("1 Pall Mall", "London", "W1A 1WW"));
        }

        tx.commit();
        em.close();
    }

}
