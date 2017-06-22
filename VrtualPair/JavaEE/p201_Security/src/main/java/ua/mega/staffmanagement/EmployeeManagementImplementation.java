package ua.mega.staffmanagement;

import ua.mega.staffmanagement.dataaccess.EmployeeDataAccessImplementation;
import ua.mega.staffmanagement.dataaccess.EmployeeNotFoundException;
import ua.mega.staffmanagement.domain.Employee;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.List;

@Stateless
@WebService(name = "employeeManagementWebservice")
@RolesAllowed("admin")
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

    @Override
    public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
        return dao.findById(id);
    }

    @Override
    public void deleteEmployeeById(int id) throws EmployeeNotFoundException {
        dao.deleteById(id);
    }
}
