package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Tutor;
import ua.mega.services.TutorManagement;

import javax.persistence.OptimisticLockException;

public class HibernateTestHarness {

    public static void main(String[] args) {

        TutorManagement tutorManagement = new TutorManagement();

//        Tutor tutor = tutorManagement.findTutorById(1);
        Tutor tutor = tutorManagement.findTutorByIdWithSupervisionGroup(1);
        System.out.println("Tutor name: " + tutor.getName());

        int size = tutor.getSupervisionGroup().size(); // no exception
        System.out.println(size);

    }
}
