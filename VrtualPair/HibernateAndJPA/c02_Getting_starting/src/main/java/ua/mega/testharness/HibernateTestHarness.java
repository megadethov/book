package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Tutor;
import ua.mega.services.TutorManagement;

import javax.persistence.OptimisticLockException;

public class HibernateTestHarness {
    public static void main(String[] args) {
        TutorManagement tutorManagement = new TutorManagement();

        // STEP 1
        Tutor newTutor = tutorManagement.createNewTutor("1234567", "Clara Jones", 10000);

        // client will now sit and wait....

        newTutor.setName("Clara Smith");

        // STEP 2 - because there's been, check for a stale object
        try {
            tutorManagement.updateTutor(newTutor);
        } catch (OptimisticLockException e) {
            // deal with the problem
            System.out.println("Sorry, that tutor was updated while you where thinking. Please try again!");
        }

    }
}
