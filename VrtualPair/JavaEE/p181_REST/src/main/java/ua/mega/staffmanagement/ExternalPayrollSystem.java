package ua.mega.staffmanagement;

import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.Stateless;

@Stateless
public class ExternalPayrollSystem {

    public void enrollEmployee(Employee newEmployee) throws SystemUnavailableException {
        if (Math.random() < 1.0) {
            throw new SystemUnavailableException();
        } else {
            // do something
        }
    }
}
