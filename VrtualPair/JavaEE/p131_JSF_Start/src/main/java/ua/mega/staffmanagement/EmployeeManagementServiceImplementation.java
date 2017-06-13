package ua.mega.staffmanagement;

import ua.mega.staffmanagement.dataaccess.EmployeeDataAccessImplementation;
import ua.mega.staffmanagement.domain.Employee;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class EmployeeManagementServiceImplementation implements EmployeeManagementService {

    @EJB
    EmployeeDataAccessImplementation dao;

    @EJB
    ExternalPayrollSystem payrollSystem;

   /* @Resource
    SessionContext glassfish;*/

    @Override
    public void registerEmployee(Employee newEmployee) throws SystemUnavailableException {
        dao.insert(newEmployee);
      if (true) payrollSystem.enrollEmployee(newEmployee);
    }

/*    @Override
    public void registerEmployee(Employee newEmployee) throws SystemUnavailableException {
        try {
            dao.insert(newEmployee);
            if (true) payrollSystem.enrollEmployee(newEmployee);
        } catch (SystemUnavailableException e) {
            glassfish.setRollbackOnly();
            throw e;
        }
    }*/


    @Override
    public List<Employee> getAllEmployees() {
        return dao.findAllEmployee();
    }

    @Override
    public List<Employee> searchBySurname(String surname) {
        return dao.findBySurname(surname);
    }
}
