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
    @MapKey(name = "enrollmentID")
    @JoinColumn(name="TUTOR_FK")
    private Map<String, Student> supervisionGroup;

    public Tutor() {
    }

    public Tutor(String staffId, String name, int salary) {
        this.staffId = staffId;
        this.name = name;
        this.salary = salary;
        this.supervisionGroup = new HashMap<String, Student>();
    }

    public String getName() {
        return name;
    }

    public Map<String, Student> getSupervisionGroup() {
        Map<String, Student> unmodifiable = Collections.unmodifiableMap(this.supervisionGroup);
        return unmodifiable;
    }

    public void addStudentToSupervisionGroup(Student studentToAdd) {
        this.supervisionGroup.put(studentToAdd.getEnrollmentId(), studentToAdd);
    }
}
