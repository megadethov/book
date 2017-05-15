package ua.mega.testharness;

import ua.mega.services.TutorManagement;

public class HibernateTestHarness {
    public static void main(String[] args)
    {
        TutorManagement tutorManagement = new TutorManagement();
        tutorManagement.createNewTutor("1234567", "Clara Jones", 10000);
    }
}
