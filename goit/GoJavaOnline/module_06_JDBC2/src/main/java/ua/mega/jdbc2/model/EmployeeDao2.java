package ua.mega.jdbc2.model;

import java.util.List;

public interface EmployeeDao2 {
    Employee load(int id);

    List<Employee> getAll();
}
