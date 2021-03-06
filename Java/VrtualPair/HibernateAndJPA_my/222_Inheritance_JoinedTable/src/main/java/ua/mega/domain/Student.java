package ua.mega.domain;

import javax.persistence.*;

@Entity
public class Student extends Person {

    @Column(unique = true, nullable = false)
    private String enrollmentID;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "TUTOR_FK")
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
    public Student(String name, String enrollmentID, String city, String street, String zioOrPostecode) {
        super(name);
        this.enrollmentID = enrollmentID;
        address = new Address(city, street, zioOrPostecode);
    }

    public Student(String name, String enrollmentID) {
        super(name);
        this.enrollmentID = enrollmentID;
        address = null;
    }

    public double calculateGradePointAverage () {
        // some complex business logic!
        // we won't need this method on the course, BUT it is import
        // to remember that classes aren't just get/set pairs - we expect
        // business logic in here as well.  
        return 0;
    }

    @Override
    public String toString() {
        return getName() + " lives at " + address;
    }

    public String getEnrollmentID() {
        return enrollmentID;
    }

    public void allocateSupervisor(Tutor myTutor) {
        this.supervisor = myTutor;
        myTutor.getModifiableGroup().add(this);
    }

    public String getSupervisorName() {
        return this.supervisor.getName();
    }

    public Tutor getSupervisor() {
        return supervisor;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    @Override
    public void calculateReport() {
        System.out.println("Report for tutor " + this.getName());
    }
}
