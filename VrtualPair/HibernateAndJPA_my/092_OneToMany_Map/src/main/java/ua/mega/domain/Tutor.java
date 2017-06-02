package ua.mega.domain;

import javax.persistence.*;
import java.sql.Struct;
import java.util.*;

@Entity
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String stuffId;
    private String name;
    private int salary;

    @OneToMany
    @MapKey(name = "enrollmentID")
    @JoinColumn(name = "TUTOR_FK")
    private Map<String, Student> supervisionGroup;

    public Tutor() {
    }

    public Tutor(String stuffId, String name, int salary) {
        this.stuffId = stuffId;
        this.name = name;
        this.salary = salary;
        supervisionGroup = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public void addStudentToSupervisionGroup(Student addStudent) {
        supervisionGroup.put(addStudent.getEnrollmentID(), addStudent);
    }

    public Map<String, Student> getSupervisionGroup() {
        Map<String, Student> unmodifiableGroup = Collections.unmodifiableMap(this.supervisionGroup);
        return unmodifiableGroup;
    }
}
