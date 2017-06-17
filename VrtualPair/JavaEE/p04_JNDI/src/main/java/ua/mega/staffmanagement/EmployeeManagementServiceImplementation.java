package ua.mega.staffmanagement;

import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class EmployeeManagementServiceImplementation implements EmployeeManagementService {
    @Override
    public void registerEmployee(Employee newEmployee) {

    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> tempList = new ArrayList<>();
        tempList.add(new Employee("Vasya", "Pupkin", "manager", 10000));
        tempList.add(new Employee("Ivan", "Ivanov", "boss", 500000));
        return tempList;
    }

    @Override
    public List<Employee> searchBySurname(String surname) {
        List<Employee> tempList = new ArrayList<>();
        tempList.add(new Employee("temp", "temp", "temp", 100));
        return tempList;
    }
}
