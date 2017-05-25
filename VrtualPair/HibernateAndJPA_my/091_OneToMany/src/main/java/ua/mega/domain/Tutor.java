package ua.mega.domain;

import javax.persistence.*;
import java.sql.Struct;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String stuffId;
    private String name;
    private int salary;

    @OneToMany
    private Set<Student> supervisionGroup;

    public Tutor() {
    }

    public Tutor(String stuffId, String name, int salary) {
        this.stuffId = stuffId;
        this.name = name;
        this.salary = salary;
        supervisionGroup = new HashSet<>();
    }

    public String getName() {
        return this.name;
    }

    public void addStudentToSupervisionGroup(Student addStudent) {
        supervisionGroup.add(addStudent);
    }

    public Set<Student> getSupervisionGroup() {
        Set<Student> unmodifiableGroup = Collections.unmodifiableSet(this.supervisionGroup);
        return unmodifiableGroup;
    }
}
