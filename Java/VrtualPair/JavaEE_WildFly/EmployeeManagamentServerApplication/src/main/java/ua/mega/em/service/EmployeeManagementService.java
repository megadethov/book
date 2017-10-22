package ua.mega.em.service;

import ua.mega.em.domain.Employee;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface EmployeeManagementService {
    public void registerEmployee(Employee newEmployee);

    public List<Employee> getAllEmployees();

    public List<Employee> searchBySurname(String surname);
}
