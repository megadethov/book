package ua.mega.domain;

import javax.persistence.*;

/**
 * Represents a Student enrolled in the college management
 * system (CMS)
 */
@Entity
@SecondaryTable(name="TBL_ADDRESS")
public class Student {
    // if we're prefer using property access, add annotation to getters (+ we can add logic to get-set method)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true, nullable = false)
    private String enrollmentID;
    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="TUTOR_FK")
    private Tutor supervisor;

    @Column(table = "TBL_ADDRESS")
    private String city;
    @Column(table = "TBL_ADDRESS")
    private String street;
    @Column(table = "TBL_ADDRESS", name = "ZIP_OR_POSTCODE")
    private String zipOrPostcode;

    /**
     * Required by Hibernate
     */
    public Student() {
    }

    /**
     * Initialises a student with no pre set tutor
     */
    public Student(String name, String enrollmentID, String street, String city, String zipOrPostecode) {
        this.name = name;
        this.enrollmentID = enrollmentID;
        this.supervisor = null;
        this.city = city;
        this.street = street;
        this.zipOrPostcode = zipOrPostecode;
    }

    public Student(String enrollmentID, String name) {
        this.enrollmentID = enrollmentID;
        this.name = name;
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
        return this.name + " lives at: " + this.street + ", " + this.city;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return enrollmentID != null ? enrollmentID.equals(student.enrollmentID) : student.enrollmentID == null;
    }

    @Override
    public int hashCode() {
        return enrollmentID != null ? enrollmentID.hashCode() : 0;
    }
}
