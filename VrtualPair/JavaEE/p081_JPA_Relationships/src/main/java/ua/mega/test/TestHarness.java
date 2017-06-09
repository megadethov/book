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

        Employee employee = em.find(Employee.class, 1);

        Note note2 = new Note("Promoted today");
        em.persist(note2);

        employee.addNote(note2);

        Set<Note> notes = employee.getAllNotes();
        for (Note next : notes) {
            System.out.println(next);
        }

        tx.commit();
        em.close();
    }
}
