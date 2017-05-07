package ua.mega.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String staffId;
    private String name;
    private int salary;

    public Tutor() {
    }

    public Tutor(String staffId, String name, int salary) {
        this.staffId = staffId;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}
