package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Tutor;
import ua.mega.services.TutorManagement;

import javax.persistence.OptimisticLockException;

public class HibernateTestHarness {

    public static void main(String[] args) {

        TutorManagement tutorManagement = new TutorManagement();

        Tutor tutor = tutorManagement.findTutorById(1); // here em.close()

        System.out.println("Tutor name: " + tutor.getName());

        int size = tutor.getSupervisionGroup().size(); // here LazyInitializationException if FetchType.LAZY
        System.out.println(size);

    }
}
