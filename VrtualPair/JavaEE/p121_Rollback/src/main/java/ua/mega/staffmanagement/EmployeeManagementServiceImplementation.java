package ua.mega.staffmanagement;

import ua.mega.staffmanagement.dataaccess.EmployeeDataAccessImplementation;
import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class EmployeeManagementServiceImplementation implements EmployeeManagementService {

    @EJB
    EmployeeDataAccessImplementation dao;

    @Override
    public void registerEmployee(Employee newEmployee) {
        dao.insert(newEmployee);
        throw new NullPointerException(); // server crash imitation
    }

    @Override
    public List<Employee> getAllEmployees() {
        return dao.findAllEmployee();
    }

    @Override
    public List<Employee> searchBySurname(String surname) {
        return dao.findBySurname(surname);
    }
}
