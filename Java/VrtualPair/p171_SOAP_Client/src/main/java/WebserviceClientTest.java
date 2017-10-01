import ua.mega.staffmanagement.Employee;
import ua.mega.staffmanagement.EmployeeManagementImplementationService;
import ua.mega.staffmanagement.EmployeeManagementWebService;

import javax.xml.ws.BindingProvider;
import java.util.List;

public class WebserviceClientTest {
    public static void main(String[] args) {
        EmployeeManagementWebService service = new EmployeeManagementImplementationService().getEmployeeManagementWebServicePort();

        // for security
        ((BindingProvider)service).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "mega");
        ((BindingProvider)service).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "mega");

        List<Employee> allEmployees = service.getAllEmployees();
        for (Employee next : allEmployees) {
            System.out.println(next.getFirstName() + " " + next.getSurname());
        }

       /* Employee newEmployee = new Employee();
        newEmployee.setFirstName("Lena");
        newEmployee.setSurname("Shpak");
        newEmployee.setJobRole("manager");
        newEmployee.setSalary(11);

        service.registerEmployee(newEmployee);*/

    }
}
