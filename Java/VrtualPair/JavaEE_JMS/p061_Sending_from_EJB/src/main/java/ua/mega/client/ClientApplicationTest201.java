package ua.mega.client;


//import com.sun.appserv.security.ProgrammaticLogin;
import ua.mega.staffmanagement.EmployeeManagementServiceRemote;
import ua.mega.staffmanagement.SystemUnavailableException;
import ua.mega.staffmanagement.domain.Employee;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

public class ClientApplicationTest201 {
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();

            EmployeeManagementServiceRemote service = (EmployeeManagementServiceRemote) jndi.lookup("java:global/EmployeeManagement/EmployeeManagementImplementation!ua.mega.staffmanagement.EmployeeManagementServiceRemote");

            try {

                // for security
               /* ProgrammaticLogin pl = new ProgrammaticLogin();
                pl.login("mega", "mega");*/

                List<Employee> allEmployees = service.getAllEmployees();

                for (Employee next : allEmployees) {
                    System.out.println(next);
                }


            } catch (SystemUnavailableException e) {
                System.out.println("Sorry, the payroll system is unavailable. Try again later.");
            } /*catch (EmployeeNotFoundException e) {
                System.out.println("Sorry, Employee not found...");
            }*/
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
