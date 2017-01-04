package ua.mega.hibernate.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.mega.hibernate.model.Employee;
import ua.mega.hibernate.model.Waiter;
import ua.mega.hibernate.dao.EmployeeDao;
import ua.mega.hibernate.model.Position;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeController {

    private EmployeeDao employeeDao;

    @Transactional
    public void initEmployees() {

        Waiter john = new Waiter();
        john.setName("John");
        john.setSurname("Smith");
        john.setPhoneNumber("555-55-55");
        john.setPosition(Position.WAITER);
        john.setSalary(25000.00F);
        employeeDao.save(john);

        Waiter mary = new Waiter();
        john.setName("Mary");
        john.setSurname("Smith");
        john.setPhoneNumber("555-55-55");
        john.setPosition(Position.WAITER);
        john.setSalary(25000.00F);
        employeeDao.save(mary);
    }

    @Transactional
//    public void printEmployee(Long id) {
//        System.out.println(employeeDao.load(id));
//        System.out.println(employeeDao.load(id));
//    }

    public void printEmployee(String name) {
        System.out.println(employeeDao.findByName(name));
        System.out.println(employeeDao.findByName(name));
    }

    @Transactional
    public void createEmployee() {

        Set<Employee> allEmployees = new HashSet<>(employeeDao.findAll());

        Employee employee = new Employee();

        employee.setId(1L);
        employee.setName("John");
        employee.setSurname("Smith");
        employee.setPosition(Position.WAITER);
        employee.setPhoneNumber("555-55-55");
        employee.setSalary(25000.0F);

        if (!allEmployees.contains(employee)) {
            employeeDao.save(employee);
        }
    }

    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    @Transactional
    public Employee getEmployeeByName(String name) {
        return employeeDao.findByName(name);
    }

    @Transactional
    public void removeAllEmployee() {
        employeeDao.removeAll();
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

}
