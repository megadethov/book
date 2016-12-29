package ua.mega.hibernate.model.dao;

import ua.mega.hibernate.model.Employee;

import java.util.List;

public interface EmployeeDao {

    void save(Employee employee);

    Employee load(Long id);

    List<Employee> findAll();

    void remove(Employee employee);
}