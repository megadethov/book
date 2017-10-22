package ua.mega.em.domain;

public class Employee {
    private String firstName;
    private String surname;
    private String jobRole;
    private int salary;

    public Employee(String firstName, String surname, String jobRole, int salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.jobRole = jobRole;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee - " + firstName + " " + surname;
    }
}
