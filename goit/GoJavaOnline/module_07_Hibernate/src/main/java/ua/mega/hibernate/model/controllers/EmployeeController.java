package ua.mega.hibernate.model.controllers;

import ua.mega.hibernate.model.Employee;
import ua.mega.hibernate.model.EmployeeDao;
import ua.mega.hibernate.model.Position;

public class EmployeeController {

    private EmployeeDao employeeDao;

    public void createEmployee() {
        Employee employee = new Employee();

        employee.setId(1L);
        employee.setName("John");
        employee.setSurname("Smith");
        employee.setPosition(Position.WAITER);
        employee.setPhoneNumber("555-55-55");
        employee.setSalary(25000.0F);

        employeeDao.save(employee);

    }


}
