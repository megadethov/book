package ua.mega.client;

import ua.mega.staffmanagement.EmployeeManagementServiceRemote;
import ua.mega.staffmanagement.dataaccess.EmployeeNotFoundException;
import ua.mega.staffmanagement.SystemUnavailableException;
import ua.mega.staffmanagement.domain.Employee;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientApplicationTest {
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();

            EmployeeManagementServiceRemote service = (EmployeeManagementServiceRemote) jndi.lookup("java:global/EmployeeManagement/EmployeeManagementImplementation!ua.mega.staffmanagement.EmployeeManagementServiceRemote");

            try {
//                service.registerEmployee(new Employee("Richard2", "Chesterwood2", "Programmer2", 0));

                Employee foundEmployee = service.getEmployeeById(2);
                System.out.println(foundEmployee);

            } catch (SystemUnavailableException e) {
                System.out.println("Sorry, the payroll system is unavailable. Try again later.");
            } catch (EmployeeNotFoundException e) {
                System.out.println("Sorry, Employee not found...");
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
