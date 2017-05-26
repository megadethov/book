package ua.mega.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String stuffId;
    private String name;
    private int salary;

    @OneToMany(mappedBy = "supervisor")
    private List<Student> supervisionGroup;

    public Tutor() {
    }

    public Tutor(String stuffId, String name, int salary) {
        this.stuffId = stuffId;
        this.name = name;
        this.salary = salary;
        supervisionGroup = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addStudentToSupervisionGroup(Student addStudent) {
        supervisionGroup.add(addStudent);
        addStudent.allocateSupervisor(this);
    }

    public List<Student> getSupervisionGroup() {
        List<Student> unmodifiableGroup = Collections.unmodifiableList(this.supervisionGroup);
        return unmodifiableGroup;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "stuffId='" + stuffId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
