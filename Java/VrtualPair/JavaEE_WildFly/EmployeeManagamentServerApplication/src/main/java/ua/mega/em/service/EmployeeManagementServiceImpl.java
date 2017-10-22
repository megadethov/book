package ua.mega.em.service;

import ua.mega.em.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementServiceImpl implements EmployeeManagementService {
    @Override
    public void registerEmployee(Employee newEmployee) {

    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shawn", "Ray", "programmer", 1000));
        employees.add(new Employee("Flex", "Wheeler", "tester", 800));
        employees.add(new Employee("Milos", "Sarcev", "manager", 1200));
        return employees;
    }

    @Override
    public List<Employee> searchBySurname(String surname) {
        return null;
    }
}
