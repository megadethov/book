package ua.mega.client;

import ua.mega.staffmanagement.EmployeeManagementService;
import ua.mega.staffmanagement.SystemUnavailableException;
import ua.mega.staffmanagement.domain.Employee;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientApplicationTest {
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();

            EmployeeManagementService service = (EmployeeManagementService) jndi.lookup("java:global/Employee/EmployeeManagementServiceImplementation");

            try {
                service.registerEmployee(new Employee("Richard2", "Chesterwood2", "Programmer2", 0));
            } catch (SystemUnavailableException e) {
                System.out.println("Sorry, the payroll system is unavailable. Try again later.");
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
