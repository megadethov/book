package ua.mega.hibernate.dao;

import ua.mega.hibernate.model.Employee;

import java.util.List;

public interface EmployeeDao {

    void save(Employee employee);

    Employee load(Long id);

    List<Employee> findAll();

    Employee findByName(String name);

    void remove(Employee employee);

    void removeAll();
}
