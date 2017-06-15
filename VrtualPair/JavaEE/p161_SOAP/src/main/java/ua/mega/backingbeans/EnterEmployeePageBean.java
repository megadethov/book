package ua.mega.backingbeans;

import ua.mega.staffmanagement.EmployeeManagementServiceImplementation;
import ua.mega.staffmanagement.EmployeeManagementServiceLocal;
import ua.mega.staffmanagement.SystemUnavailableException;
import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "employee")
public class EnterEmployeePageBean {
    private String firstName;
    private String surname;
    private String jobRole;
    private int salary;

    @EJB
    private EmployeeManagementServiceLocal serviceLocal;

    public String createEmployee() {
        try {
            serviceLocal.registerEmployee(new Employee(firstName, surname, jobRole, salary));
            return "all-employees";
         } catch (SystemUnavailableException e) {
            System.out.println("System Unavailable. Sorry.");
            return "systemDown";
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
