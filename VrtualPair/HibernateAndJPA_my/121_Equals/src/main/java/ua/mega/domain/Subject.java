package ua.mega.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true, nullable = false)
    private String subjectName;
    private int numberOfSemesters;
    @ManyToMany(mappedBy = "taughtSubjects")
    private Set<Tutor> subjectTeachers;

    public Subject() {
    }

    public Subject(String subjectName) {
        this.subjectName = subjectName;
        subjectTeachers = new HashSet<>();
    }

    public Set<Tutor> getSubjectTeachers() {
        return this.subjectTeachers;
    }

    public void addTeacherToSubject(Tutor addTutor) {
        this.subjectTeachers.add(addTutor);
        addTutor.getTaughtSubjects().add(this);
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
