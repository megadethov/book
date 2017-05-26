package ua.mega.domain;

import javax.persistence.*;
import java.util.*;

@Entity
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String stuffId;
    private String name;
    private int salary;

    @OneToMany(mappedBy = "supervisor")
    private Set<Student> supervisionGroup;

    @ManyToMany
    private Set<Subject> taughtSubjects;

    public Tutor() {
    }

    public Tutor(String stuffId, String name, int salary) {
        this.stuffId = stuffId;
        this.name = name;
        this.salary = salary;
        supervisionGroup = new HashSet<>();
        taughtSubjects = new HashSet<>();
    }

    public Set<Subject> getTaughtSubjects() {
        return this.taughtSubjects;
    }

    public void addSubjectToTutor(Subject addSubject) {
        taughtSubjects.add(addSubject);
        addSubject.getSubjectTeachers().add(this);
    }

    public String getName() {
        return this.name;
    }

    public void addStudentToSupervisionGroup(Student addStudent) {
        supervisionGroup.add(addStudent);
        addStudent.allocateSupervisor(this);
    }

    public Set<Student> getSupervisionGroup() {
        Set<Student> unmodifiableGroup = Collections.unmodifiableSet(this.supervisionGroup);
        return unmodifiableGroup;
    }
    public Set<Student> getModifiableGroup() {
        return this.supervisionGroup;
    }



    @Override
    public String toString() {
        return "Tutor{" +
                "stuffId='" + stuffId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}