package ua.mega.staffmanagement;

import ua.mega.staffmanagement.dataaccess.EmployeeNotFoundException;
import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.Local;
import java.util.List;

@Local
public interface EmployeeManagementServiceLocal {
    public void registerEmployee(Employee newEmployee) throws SystemUnavailableException;

    public List<Employee> getAllEmployees();

    public List<Employee> searchBySurname(String surname);

    public Employee getEmployeeById(int id) throws EmployeeNotFoundException;

    public void deleteEmployeeById(int id) throws EmployeeNotFoundException;
}
