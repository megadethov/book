package ua.mega.staffmanagement;

import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.Stateless;

@Stateless
public class ExternalPayrollSystem {
    public void enrollEmployee(Employee newEmployee) throws SystemUnavailableException {
         throw new SystemUnavailableException();
    }
}
