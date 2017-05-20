package ua.mega.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true, nullable = false)
    private String subjectName;
    private int numberOfSemesters;

    @ManyToMany
    private Set<Tutor> qualifiedTutors;

    public Subject() {
    }

    public Subject(String subjectName, int numberOfSemesters) {
        this.subjectName = subjectName;
        this.numberOfSemesters = numberOfSemesters;
        this.qualifiedTutors = new HashSet<>();
    }

    public void addTutorToSubject(Tutor tutor)
    {
        this.qualifiedTutors.add(tutor);
        tutor.getSubjects().add(this);
    }

    public String toString() {
        return this.subjectName + " lasts for " + this.numberOfSemesters + " semesters";
    }

    public Set<Tutor> getQualifiedTutors() {
        return this.qualifiedTutors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        return subjectName != null ? subjectName.equals(subject.subjectName) : subject.subjectName == null;
    }

    @Override
    public int hashCode() {
        return subjectName != null ? subjectName.hashCode() : 0;
    }
}
