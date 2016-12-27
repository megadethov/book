package ua.mega.jdbc.model;

import java.util.List;

public interface EmployeeDao2 {
    Employee load(int id);

    List<Employee> getAll();
}
