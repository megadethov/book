package ua.mega.client;

import ua.mega.staffmanagement.EmployeeManagementService;
import ua.mega.staffmanagement.domain.Employee;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

public class ClientApplicationTest {
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();

            EmployeeManagementService service = (EmployeeManagementService) jndi.lookup("java:global/Employee/EmployeeManagementServiceImplementation");

            service.registerEmployee(new Employee("Richard", "Chesterwood", "Programmer", 0));
            List<Employee> employees = service.getAllEmployees();
            for (Employee next : employees) {
                System.out.println(next);
            }

            /*List<Employee> employees = service.searchBySurname("Chesterwood");
            for (Employee next : employees) {
                System.out.println(next);
            }*/

        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
