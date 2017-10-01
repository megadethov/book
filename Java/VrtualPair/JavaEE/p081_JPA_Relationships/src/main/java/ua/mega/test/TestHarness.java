package ua.mega.test;

import ua.mega.staffmanagement.domain.Employee;
import ua.mega.staffmanagement.domain.Note;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Set;

public class TestHarness {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeeDB");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        /*Employee employee = new Employee("Vasya", "Pupkin", "Java coder", 1000);
        em.persist(employee);
        Note note = new Note("Joined to Company");
        em.persist(note);
        employee.addNote(note);*/

       /* Employee employee = em.find(Employee.class, 1);
        Note note2 = new Note("Promoted today");
        em.persist(note2);
        employee.addNote(note2);
        Set<Note> notes = employee.getAllNotes();
        for (Note next : notes) {
            System.out.println(next);
        }*/

        Employee employee = new Employee("Vasya", "Pupkin", "Java coder", 1000);
        em.persist(employee);
        Employee employee2 = new Employee("Ivan", "Ivanov", "PHP coder", 300);
        em.persist(employee2);
        Employee employee3 = new Employee("Pyotr", "Petrov", "RUBY coder", 800);
        em.persist(employee3);

        Note note = new Note("Joined to company");
//        em.persist(note);
        Note note2 = new Note("Promoted");
//        em.persist(note2);
        Note note3 = new Note("Dismissed");
//        em.persist(note3);
        Note note4 = new Note("Second note");
//        em.persist(note4);

        employee.addNote(note);
        employee2.addNote(note2);
        employee3.addNote(note3);
        employee3.addNote(note4);

        tx.commit();
        em.close();
    }
}
