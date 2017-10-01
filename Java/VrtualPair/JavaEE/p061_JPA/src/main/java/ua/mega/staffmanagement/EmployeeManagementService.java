package ua.mega.staffmanagement;

import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.EJB;
import javax.ejb.Remote;
import java.util.List;

@Remote
public interface EmployeeManagementService {
    public void registerEmployee(Employee newEmployee);

    public List<Employee> getAllEmployees();

    public List<Employee> searchBySurname(String surname);
}
