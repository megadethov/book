package ua.mega.staffmanagement.dataaccess;

import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.Local;
import java.util.List;

@Local
public interface EmployeeDataAccess {
    public void insert(Employee newEmployee);

    public List<Employee> findAllEmployee();

    public List<Employee> findBySurname();

}
