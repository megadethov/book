package ua.mega.hibernate.model;

import java.util.List;

public interface EmployeeDao {

    void save(Employee employee);

    Employee load(Long id);

    List<Employee> findAll();

    void remove(Employee employee);
}
