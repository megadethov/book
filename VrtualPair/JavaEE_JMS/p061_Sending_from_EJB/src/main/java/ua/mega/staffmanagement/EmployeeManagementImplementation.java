package ua.mega.staffmanagement;

import ua.mega.staffmanagement.dataaccess.EmployeeDataAccessImplementation;
import ua.mega.staffmanagement.dataaccess.EmployeeNotFoundException;
import ua.mega.staffmanagement.domain.Employee;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.*;
import javax.jws.WebService;
import javax.naming.Context;
import java.util.List;

@Stateless
@WebService(name = "employeeManagementWebService")
@RolesAllowed("admin")
public class EmployeeManagementImplementation implements EmployeeManagementServiceLocal, EmployeeManagementServiceRemote {

    @EJB
    EmployeeDataAccessImplementation dao;

    @EJB
    ExternalPayrollSystem payrollSystem;

    @Resource(mappedName = "jms/EmployeeManagementQueue")
    private Queue queue;

    @Resource(mappedName = "jms/ConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Override
    public void registerEmployee(Employee newEmployee) throws SystemUnavailableException {
        dao.insert(newEmployee);
//        payrollSystem.enrollEmployee(newEmployee); // crash system

        // send Message to the Queue
        Connection connection = null;
        try {
            connection = connectionFactory.createConnection();
            Session session = connection.createSession(false, 0);
            MessageProducer messageProducer = session.createProducer(queue);
            MapMessage message = session.createMapMessage();
            message.setStringProperty("firstName", "Vasya");
            message.setStringProperty("surname", "Pupkin");
            message.setInt("salary", 100);
            messageProducer.send(message);

            session.close();

        } catch (JMSException e) {
//            throw new SystemUnavailableException();
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return dao.findAllEmployee();
    }

    @Override
    public List<Employee> searchBySurname(String surname) {
        return dao.findBySurname(surname);
    }

    @Override
    public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
        return dao.findById(id);
    }

    @Override
    public void deleteEmployeeById(int id) throws EmployeeNotFoundException {
        dao.deleteById(id);
    }
}
