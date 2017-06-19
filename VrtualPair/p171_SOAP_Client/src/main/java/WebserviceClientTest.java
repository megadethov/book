import ua.mega.staffmanagement.Employee;
import ua.mega.staffmanagement.EmployeeManagementImplementationService;
import ua.mega.staffmanagement.EmployeeManagementWebservice;

import java.util.List;

public class WebserviceClientTest {
    public static void main(String[] args) {
        EmployeeManagementWebservice service = new EmployeeManagementImplementationService().getEmployeeManagementWebservicePort();

        List<Employee> allEmployees = service.getAllEmployees();
        for (Employee next : allEmployees) {
            System.out.println(next.getFirstName() + " " + next.getSurname());
        }
    }
}
