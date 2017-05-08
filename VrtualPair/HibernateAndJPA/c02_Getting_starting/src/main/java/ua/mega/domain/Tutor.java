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

    @OneToMany
    @OrderBy("name")
    @JoinColumn(name="TUTOR_FK")
    private List<Student> supervisionGroup;

    public Tutor() {
    }

    public Tutor(String staffId, String name, int salary) {
        this.staffId = staffId;
        this.name = name;
        this.salary = salary;
        this.supervisionGroup = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getSupervisionGroup() {
        List<Student> unmodifiable = Collections.unmodifiableList(this.supervisionGroup);
        return unmodifiable;
    }

    public void addStudentToSupervisionGroup(Student studentToAdd) {
        this.supervisionGroup.add(studentToAdd);
    }
}
