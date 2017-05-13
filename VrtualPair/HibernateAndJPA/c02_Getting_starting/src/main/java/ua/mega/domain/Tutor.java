package ua.mega.domain;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Tutor extends Person {

//    @Column(unique = true, nullable = false)
    private String staffId;
    private int salary;

    @OneToMany(mappedBy = "supervisor", cascade = {CascadeType.PERSIST})
    private Set<Student> supervisionGroup;

    @ManyToMany(mappedBy = "qualifiedTutors")
    private Set<Subject> subjectsQualifiedToTeach;

    public Tutor() {
        super(null);
    }

    public Tutor(String staffId, String name, int salary) {
        super(name);
        this.staffId = staffId;
        this.salary = salary;
        this.supervisionGroup = new LinkedHashSet<>();
        subjectsQualifiedToTeach = new HashSet<>();
    }

    public void addSubjectToQualifications(Subject subject)
    {
        this.subjectsQualifiedToTeach.add(subject);
        subject.getQualifiedTutors().add(this);
    }

    public String getName() {
        return super.getName();
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

    @Override
    public String toString() {
        return "Tutor{" +
                "staffId='" + staffId + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }

    public void createNewStudentAndAddToSupervisorGroup(String name, String enrollmentID, String city, String street, String zipOrPostofficecode) {
        Student student = new Student(name, enrollmentID, city, street, zipOrPostofficecode);
        this.addStudentToSupervisionGroup(student);
    }

    public void doubleSalary() {
        this.salary = this.salary * 2;
    }

    @Override
    public void calculateReport() {
        System.out.println("Report for tutor " + this.getName());
    }
}
