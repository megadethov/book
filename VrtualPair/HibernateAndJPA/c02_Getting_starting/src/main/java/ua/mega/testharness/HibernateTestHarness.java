package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Tutor;
import ua.mega.services.TutorManagement;

import javax.persistence.OptimisticLockException;
import java.util.Scanner;

public class HibernateTestHarness {
    public static void main(String[] args) {
        TutorManagement tutorManagement = new TutorManagement();

        // STEP 1
//        Tutor newTutor = tutorManagement.findTutorById(1);
        Tutor newTutor = tutorManagement.findTutorByIdWithSupervisionGroup(1);

        System.out.println("The name of the tutor " + newTutor.getName());

        System.out.println("The tutor has " + newTutor.getSupervisionGroup().size());

    }
}
