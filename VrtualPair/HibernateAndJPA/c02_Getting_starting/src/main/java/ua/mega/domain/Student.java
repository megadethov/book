package ua.mega.domain;

import javax.persistence.*;

/**
 * Represents a Student enrolled in the college management
 * system (CMS)
 */
@Entity
public class Student {
    // if we're prefer using property access, add annotation to getters (+ we can add logic to get-set method)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String enrollmentID;
    private String name;

    @ManyToOne
    @JoinColumn(name="TUTOR_FK")
    private Tutor supervisor;

    /**
     * Required by Hibernate
     */
    public Student() {
    }

    /**
     * Initialises a student with a particular tutor
     */
    public Student(String name, Tutor supervisor) {
        this.name = name;
        this.supervisor = supervisor;
    }

    /**
     * Initialises a student with no pre set tutor
     */
    public Student(String name, String enrollmentID) {
        this.name = name;
        this.enrollmentID = enrollmentID;
//        this.supervisor = null;
    }

    public double calculateGradePointAverage() {
        // some complex business logic!
        // we won't need this method on the course, BUT it is import
        // to remember that classes aren't just get/set pairs - we expect
        // business logic in here as well.
        return 0;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnrollmentId() {
        return this.enrollmentID;
    }

    public void allocateSupervisor(Tutor newSuperviser) {
        this.supervisor = newSuperviser;
        newSuperviser.getModifiableSupervisionGroup().add(this);
    }
    public String getSupervisorName(){
        return this.supervisor.getName();
    }

    public Tutor getSupervisor() {
        return this.supervisor;
    }

}
