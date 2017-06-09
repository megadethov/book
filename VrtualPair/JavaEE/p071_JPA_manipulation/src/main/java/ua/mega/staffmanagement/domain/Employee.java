package ua.mega.staffmanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String firstName;
    private String surname;
    private String jobRole;
    private int salary;

    public Employee() {
    }

    public Employee(String firstName, String surname, String jobRole, int salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.jobRole = jobRole;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee - " + firstName + " " + surname;
    }
}
