package ua.mega.staffmanagement.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@XmlRootElement
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String firstName;
    private String surname;
    private String jobRole;
    private int salary;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="FK_EMPLOYEE_ID")
    private Set<Note> notes;

    public Employee() {
    }

    public Employee(String firstName, String surname, String jobRole, int salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.jobRole = jobRole;
        this.salary = salary;
        notes = new HashSet<Note>();
    }

    public void addNote(Note newNote) {
        this.notes.add(newNote);
    }

    public Set<Note> getAllNotes() {
        return this.notes;
    }

    @Override
    public String toString() {
        return "Employee - " + firstName + " " + surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
