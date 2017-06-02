package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Tutor;
import ua.mega.services.TutorManagement;

public class HibernateTestHarness {

    public static void main(String[] args) {

        TutorManagement tutorManagement = new TutorManagement();

        // Step 1
        Tutor tutor = tutorManagement.createTutor("12345", "Venya", 12000);

        // client seat and wait...
        tutor.setName("Clara Cetcin");

        // Step 2
        tutorManagement.updateTutor(tutor);

    }
}
