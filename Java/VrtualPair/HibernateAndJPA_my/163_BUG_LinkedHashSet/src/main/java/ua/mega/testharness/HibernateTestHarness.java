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
        myTutor.createStudentAndAddToSupervisionGroup("Vasya Pupkin", "1-PUP-293", "City-1", "Street-1", "871010");
        myTutor.createStudentAndAddToSupervisionGroup("Petya Petrov", "2-PET-293", "City-2", "Street-2", "3982727");
        myTutor.createStudentAndAddToSupervisionGroup("Jorg Sent", "3-DHj-928", "City-3", "Street-3", "9203837");
        myTutor.createStudentAndAddToSupervisionGroup("Leman Bonn", "4-BON-234", "City-4", "Street-4", "9203847");
        myTutor.createStudentAndAddToSupervisionGroup("Zoran Gor", "5-GOR-948", "City-5", "Street-25", "29304478");

        tx.commit();
        em.close();
    }
}
