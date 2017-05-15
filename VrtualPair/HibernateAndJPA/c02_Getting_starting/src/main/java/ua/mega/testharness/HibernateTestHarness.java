package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Tutor;
import ua.mega.services.TutorManagement;

public class HibernateTestHarness {
    public static void main(String[] args) {
        TutorManagement tutorManagement = new TutorManagement();

        // STEP 1
        Tutor newTutor = tutorManagement.createNewTutor("1234567", "Clara Jones", 10000);

        // client will now sit and wait....

        newTutor.setName("Clara Smith");

        // STEP 2
        tutorManagement.updateTutor(newTutor);

    }
}
