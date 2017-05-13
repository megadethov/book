package ua.mega.domain;

import javax.persistence.*;

/**
 * Represents a Student enrolled in the college management
 * system (CMS)
 */
@Entity
public class Student extends Person {

//    @Column(unique = true, nullable = false)
    private String enrollmentID;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="TUTOR_FK")
    private Tutor supervisor;

    @Embedded
    private Address address;

    /**
     * Required by Hibernate
     */
    public Student() {
        super(null);
    }

    /**
     * Initialises a student with no pre set tutor
     */
    public Student(String name, String enrollmentID, String street, String city, String zipOrPostecode) {
        super(name);
        this.enrollmentID = enrollmentID;
        this.supervisor = null;
        this.address = new Address(street, city, zipOrPostecode);
    }

    public Student(String enrollmentID, String name) {
        super(name);
        this.enrollmentID = enrollmentID;
        this.address = null;
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
        return this.getName() + " lives at: " + this.address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return super.getName();
    }

    @Override
    public void calculateReport() {
        System.out.println("Report for student " + this.getName());
    }
}
