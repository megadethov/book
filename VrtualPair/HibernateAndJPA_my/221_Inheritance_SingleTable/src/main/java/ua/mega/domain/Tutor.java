package ua.mega.domain;


import javax.persistence.*;
import java.util.*;

@Entity
@DiscriminatorValue(value = "T")
public class Tutor extends Person {

    private String stuffId;
    private int salary;

    @OneToMany(mappedBy = "supervisor", cascade = {CascadeType.PERSIST})
    private Set<Student> supervisionGroup;

    @ManyToMany(mappedBy = "subjectTeachers")
    private Set<Subject> taughtSubjects;

    public Tutor() {
        super(null);
    }

    public Tutor(String name, String stuffId, int salary) {
        super(name);
        this.stuffId = stuffId;
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
                ", name='" + getName() + '\'' +
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

    public void createStudentAndAddToSupervisionGroup(String name, String enrollmentID, String street, String city, String zipOrPosteCode) {
        Student student = new Student(name, enrollmentID, city, street, zipOrPosteCode);
        addStudentToSupervisionGroup(student);
    }

    @Override
    public void calculateReport() {
        System.out.println("Report fo Tutor: " + getName());
    }
}
