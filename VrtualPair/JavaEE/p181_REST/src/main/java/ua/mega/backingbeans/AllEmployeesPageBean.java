package ua.mega.backingbeans;

import ua.mega.staffmanagement.EmployeeManagementServiceLocal;
import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIData;
import java.util.List;

@ManagedBean(name = "allEmployeesPageBean")
public class AllEmployeesPageBean {

    @EJB
    private EmployeeManagementServiceLocal employeeService;

    private Employee selectedEmployee;

    private UIData dataTable;

    public String showEmployee() {
        selectedEmployee = (Employee) dataTable.getRowData();
        return "employeeDetail";
    }

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(Employee selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    public UIData getDataTable() {
        return dataTable;
    }

    public void setDataTable(UIData dataTable) {
        this.dataTable = dataTable;
    }

    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

}
