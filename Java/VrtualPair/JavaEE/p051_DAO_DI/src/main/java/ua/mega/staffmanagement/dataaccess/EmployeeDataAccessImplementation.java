package ua.mega.staffmanagement.dataaccess;

import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class EmployeeDataAccessImplementation implements EmployeeDataAccess {
    @Override
    public void insert(Employee newEmployee) {

    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> tempList = new ArrayList<Employee>();
        tempList.add(new Employee("Vasya", "Pupkin", "manager", 10000));
        tempList.add(new Employee("Ivan", "Ivanov", "boss", 500000));
        return tempList;
    }

    @Override
    public List<Employee> findBySurname(String surname) {
        List<Employee> tempList = new ArrayList<Employee>();
        tempList.add(new Employee("Vasya", "Pupkin", "manager", 10000));
        tempList.add(new Employee("Ivan", "Ivanov", "boss", 500000));
        return tempList;
    }


}
