import ua.mega.services.Employee;
import ua.mega.services.EmployeeServiceImpl;
import ua.mega.services.EmployeeServiceImplService;

public class Main {
    public static void main(String[] args) {
        EmployeeServiceImpl service = new EmployeeServiceImplService().getEmployeeServiceImplPort();
        Employee employee = service.getEmployeeById("1");

        System.out.println(employee.getName());
    }
}
