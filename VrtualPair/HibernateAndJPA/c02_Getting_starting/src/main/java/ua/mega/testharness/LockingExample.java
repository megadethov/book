package ua.mega.testharness;

import ua.mega.services.TutorManagement;

public class LockingExample {
    public static void main(String[] args) {
        TutorManagement tm = new TutorManagement();

        tm.generateReport();
    }
}
