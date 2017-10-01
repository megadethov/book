package ua.mega.testharness;

import ua.mega.domain.Tutor;
import ua.mega.services.TutorManagement;

public class HibernateTestHarness {

    public static void main(String[] args) {

        TutorManagement tutorManagement = new TutorManagement();

        Tutor tutor = tutorManagement.createTutor("12345", "Venya", 12000);

        // client seat and wait...

        tutor.doubleSalary();

        tutorManagement.updateTutor(tutor);

    }
}
