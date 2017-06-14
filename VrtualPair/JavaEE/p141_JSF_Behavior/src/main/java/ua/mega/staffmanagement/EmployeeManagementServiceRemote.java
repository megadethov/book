package ua.mega.staffmanagement;

import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface EmployeeManagementServiceRemote {
    public void registerEmployee(Employee newEmployee) throws SystemUnavailableException;

    public List<Employee> getAllEmployees();

    public List<Employee> searchBySurname(String surname);
}
