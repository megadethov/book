package ua.mega.staffmanagement;

import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.Stateless;

@Stateless
public class ExternalPayrollSystem {

    public void enrollEmployee(Employee newEmployee) throws SystemUnavailableException {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            //NOP
        }
    }
}
