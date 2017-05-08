package ua.mega.domain;

import javax.persistence.*;
import java.util.*;

@Entity
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String staffId;
    private String name;
    private int salary;

    @OneToMany(mappedBy = "supervisor")
    private Set<Student> supervisionGroup;

    public Tutor() {
    }

    public Tutor(String staffId, String name, int salary) {
        this.staffId = staffId;
        this.name = name;
        this.salary = salary;
        this.supervisionGroup = new HashSet<Student>();
    }

    public String getName() {
        return name;
    }

    public Set<Student> getSupervisionGroup() {
        Set<Student> unmodifiable = Collections.unmodifiableSet(this.supervisionGroup);
        return unmodifiable;
    }

    public void addStudentToSupervisionGroup(Student studentToAdd) {
        this.supervisionGroup.add(studentToAdd);
    }
}
