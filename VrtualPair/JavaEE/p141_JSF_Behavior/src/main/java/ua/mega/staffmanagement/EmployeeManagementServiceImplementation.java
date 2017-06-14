package ua.mega.staffmanagement;

import ua.mega.staffmanagement.dataaccess.EmployeeDataAccessImplementation;
import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class EmployeeManagementServiceImplementation implements EmployeeManagementServiceLocal, EmployeeManagementServiceRemote{

    @EJB
    EmployeeDataAccessImplementation dao;

    @EJB
    ExternalPayrollSystem payrollSystem;

    @Override
    public void registerEmployee(Employee newEmployee)/* throws SystemUnavailableException*/ {
        dao.insert(newEmployee);
//      if (true) payrollSystem.enrollEmployee(newEmployee);
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
