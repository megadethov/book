package ua.mega.client;

import ua.mega.staffmanagement.EmployeeManagementServiceRemote;
import ua.mega.staffmanagement.SystemUnavailableException;
import ua.mega.staffmanagement.domain.Employee;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientApplicationTest {
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();

            EmployeeManagementServiceRemote service = (EmployeeManagementServiceRemote) jndi.lookup("java:global/EmployeeManagement/EmployeeManagementServiceImplementation!ua.mega.staffmanagement.EmployeeManagementServiceRemote");

            try {
                service.registerEmployee(new Employee("Richard3", "Chesterwood3", "Programmer3", 333));
            } catch (SystemUnavailableException e) {
                System.out.println("Sorry, the payroll system is unavailable. Try again later.");
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
