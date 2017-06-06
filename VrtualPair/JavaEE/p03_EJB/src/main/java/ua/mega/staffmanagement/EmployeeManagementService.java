package ua.mega.staffmanagement;

import ua.mega.staffmanagement.domain.Employee;

import java.util.List;

public interface EmployeeManagementService {
    public void registerEmployee(Employee newEmployee);

    public List<Employee> getAllEmployees();

    public List<Employee> searchBySurname(String surname);
}
