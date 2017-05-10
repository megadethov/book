package ua.mega.domain;

import javax.persistence.*;
import java.awt.*;
import java.util.*;

//@Entity
public class Tutor {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    @Column(unique = true, nullable = false)
    private String staffId;
    private String name;
    private int salary;

//    @OneToMany(mappedBy = "supervisor")
    private Set<Student> supervisionGroup;

//    @ManyToMany(mappedBy = "qualifiedTutors")
    private Set<Subject> subjectsQualifiedToTeach;

    public Tutor() {
    }

    public Tutor(String staffId, String name, int salary) {
        this.staffId = staffId;
        this.name = name;
        this.salary = salary;
        this.supervisionGroup = new HashSet<Student>();
        subjectsQualifiedToTeach = new HashSet<>();
    }

    public void addSubjectToQualifications(Subject subject)
    {
        this.subjectsQualifiedToTeach.add(subject);
        subject.getQualifiedTutors().add(this);
    }

    public String getName() {
        return name;
    }

    public Set<Student> getSupervisionGroup() {
        Set<Student> unmodifiable = Collections.unmodifiableSet(this.supervisionGroup);
        return unmodifiable;
    }

    public Set<Student> getModifiableSupervisionGroup()
    {
        return this.supervisionGroup;
    }

    public void addStudentToSupervisionGroup(Student studentToAdd) {
        this.supervisionGroup.add(studentToAdd);
        studentToAdd.allocateSupervisor(this);
    }

    public Set<Subject> getSubjects() {
        return subjectsQualifiedToTeach;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tutor tutor = (Tutor) o;

        return staffId != null ? staffId.equals(tutor.staffId) : tutor.staffId == null;
    }

    @Override
    public int hashCode() {
        return staffId != null ? staffId.hashCode() : 0;
    }
}
