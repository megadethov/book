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
    private List<Student> supervisionGroup;

    @ManyToMany
    private Set<Subject> taughtSubjects;

    public Tutor() {
    }

    public Tutor(String stuffId, String name, int salary) {
        this.stuffId = stuffId;
        this.name = name;
        this.salary = salary;
        supervisionGroup = new ArrayList<>();
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

    public List<Student> getSupervisionGroup() {
        List<Student> unmodifiableGroup = Collections.unmodifiableList(this.supervisionGroup);
        return unmodifiableGroup;
    }
    public List<Student> getModifiableGroup() {
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
