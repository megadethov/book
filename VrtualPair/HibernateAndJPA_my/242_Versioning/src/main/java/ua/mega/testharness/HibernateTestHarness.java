package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Tutor;
import ua.mega.services.TutorManagement;

import javax.persistence.OptimisticLockException;

public class HibernateTestHarness {

    public static void main(String[] args) {

        TutorManagement tutorManagement = new TutorManagement();

        // Step 1
//        Tutor tutor = tutorManagement.createTutor("12345", "Venya", 12000);
        Tutor tutor = tutorManagement.findTutorById(1);

        // client seat and wait...
        tutor.setName("Clara Cetcin");

        // Step 2 Because there is been a pause, check for a stale object
        try {
            tutorManagement.updateTutor(tutor);
        } catch (OptimisticLockException e) {
            // deal with the problem
            System.out.println("Sorry, that tutor was updated while you are thinking! Please try again.");
        }

    }
}
