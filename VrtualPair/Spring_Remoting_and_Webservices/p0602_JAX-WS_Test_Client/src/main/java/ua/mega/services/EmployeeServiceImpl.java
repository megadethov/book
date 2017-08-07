package ua.mega.services;

import ua.mega.domain.Employee;

import javax.jws.WebService;

@WebService
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee getEmployeeById(String id) {
        return new Employee("1", "Pupkin");
    }
}
