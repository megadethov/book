package ua.mega.domain;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String enrollmentID;
    private String name;
    private String tutorName; // This will become a class soon 
    @Column(name="NUM_COURSES")
    private Integer numberOfCourses;


    /**
     * Required by Hibernate
     */
    public Student() {
    }

    /**
     * Initialises a student with a particular tutor
     */
    public Student(String name, String tutorName) {
        this.name = name;
        this.tutorName = tutorName;
        numberOfCourses = 7;
    }
    /**
     * Initialises a student with no pre set tutor 
     */
    public Student(String name) {
        this.name = name;
        this.tutorName = null;
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
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return this.id;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }
}
