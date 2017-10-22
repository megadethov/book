package ua.mega.em.service;

import ua.mega.em.domain.Employee;

import java.util.List;

public interface EmployeeManagementService {
    public void registerEmployee(Employee newEmployee);

    public List<Employee> getAllEmployees();

    public List<Employee> searchBySurname(String surname);
}
