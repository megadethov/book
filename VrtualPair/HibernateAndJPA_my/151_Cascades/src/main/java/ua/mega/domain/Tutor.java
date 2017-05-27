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

    @OneToMany(mappedBy = "supervisor", cascade = { CascadeType.PERSIST })
    private Set<Student> supervisionGroup;

    @ManyToMany(mappedBy = "subjectTeachers")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tutor tutor = (Tutor) o;

        return stuffId != null ? stuffId.equals(tutor.stuffId) : tutor.stuffId == null;
    }

    @Override
    public int hashCode() {
        return stuffId != null ? stuffId.hashCode() : 0;
    }

    public void createStudentAndAddToSupervisionGroup(String name, String enrollmentID) {
        Student student = new Student(name, enrollmentID);
        addStudentToSupervisionGroup(student);
    }
}
