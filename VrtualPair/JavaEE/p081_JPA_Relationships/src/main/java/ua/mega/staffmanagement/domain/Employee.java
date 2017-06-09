package ua.mega.staffmanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String firstName;
    private String surname;
    private String jobRole;
    private int salary;

    private Set<Note> notes;

    public Employee() {
    }

    public Employee(String firstName, String surname, String jobRole, int salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.jobRole = jobRole;
        this.salary = salary;
        notes = new HashSet<>();
    }

    public void addNote(Note newNote) {
        this.notes.add(newNote);
    }

    @Override
    public String toString() {
        return "Employee - " + firstName + " " + surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
