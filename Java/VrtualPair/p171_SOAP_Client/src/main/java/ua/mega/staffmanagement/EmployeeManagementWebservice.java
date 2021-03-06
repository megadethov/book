
package ua.mega.staffmanagement;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "employeeManagementWebservice", targetNamespace = "http://staffmanagement.mega.ua/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeManagementWebservice {


    /**
     * 
     * @return
     *     returns java.util.List<ua.mega.staffmanagement.Employee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllEmployees", targetNamespace = "http://staffmanagement.mega.ua/", className = "ua.mega.staffmanagement.GetAllEmployees")
    @ResponseWrapper(localName = "getAllEmployeesResponse", targetNamespace = "http://staffmanagement.mega.ua/", className = "ua.mega.staffmanagement.GetAllEmployeesResponse")
    @Action(input = "http://staffmanagement.mega.ua/employeeManagementWebservice/getAllEmployeesRequest", output = "http://staffmanagement.mega.ua/employeeManagementWebservice/getAllEmployeesResponse")
    public List<Employee> getAllEmployees();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "registerEmployee", targetNamespace = "http://staffmanagement.mega.ua/", className = "ua.mega.staffmanagement.RegisterEmployee")
    @ResponseWrapper(localName = "registerEmployeeResponse", targetNamespace = "http://staffmanagement.mega.ua/", className = "ua.mega.staffmanagement.RegisterEmployeeResponse")
    @Action(input = "http://staffmanagement.mega.ua/employeeManagementWebservice/registerEmployeeRequest", output = "http://staffmanagement.mega.ua/employeeManagementWebservice/registerEmployeeResponse")
    public void registerEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        Employee arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<ua.mega.staffmanagement.Employee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchBySurname", targetNamespace = "http://staffmanagement.mega.ua/", className = "ua.mega.staffmanagement.SearchBySurname")
    @ResponseWrapper(localName = "searchBySurnameResponse", targetNamespace = "http://staffmanagement.mega.ua/", className = "ua.mega.staffmanagement.SearchBySurnameResponse")
    @Action(input = "http://staffmanagement.mega.ua/employeeManagementWebservice/searchBySurnameRequest", output = "http://staffmanagement.mega.ua/employeeManagementWebservice/searchBySurnameResponse")
    public List<Employee> searchBySurname(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
