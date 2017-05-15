package ua.mega.testharness;

import ua.mega.domain.Tutor;
import ua.mega.services.TutorManagement;

public class HibernateTestHarness {
    public static void main(String[] args) {
        TutorManagement tutorManagement = new TutorManagement();
        Tutor newTutor = tutorManagement.createNewTutor("1234567", "Clara Jones", 10000);

        // client will now sit and wait....

        newTutor.doubleSalary();

        tutorManagement.updateTutor(newTutor);

    }
}
