package ua.mega.backingbeans;

import ua.mega.staffmanagement.EmployeeManagementServiceLocal;
import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean(name = "allEmployeesPageBean")
public class AllEmployeesPageBean {

    @EJB
    private EmployeeManagementServiceLocal employeeService;

    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
