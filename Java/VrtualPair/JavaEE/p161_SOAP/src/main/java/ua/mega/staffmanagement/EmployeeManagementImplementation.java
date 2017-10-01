package ua.mega.staffmanagement;

import ua.mega.staffmanagement.dataaccess.EmployeeDataAccessImplementation;
import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.List;

@Stateless
@WebService(name = "employeeManagementWebservice")
public class EmployeeManagementImplementation implements EmployeeManagementServiceLocal, EmployeeManagementServiceRemote {

    @EJB
    EmployeeDataAccessImplementation dao;

    @EJB
    ExternalPayrollSystem payrollSystem;

    @Override
    public void registerEmployee(Employee newEmployee) throws SystemUnavailableException {
        dao.insert(newEmployee);
        payrollSystem.enrollEmployee(newEmployee); // crash system
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
