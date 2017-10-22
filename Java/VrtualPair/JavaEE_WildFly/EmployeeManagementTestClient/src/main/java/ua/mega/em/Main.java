package ua.mega.em;

import ua.mega.em.domain.Employee;
import ua.mega.em.service.EmployeeManagementService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws NamingException {
        final Properties jndiProperties = new Properties();
        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, org.jboss.naming.remote.client.InitialContextFactory.class.getName());
        jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
        jndiProperties.put("jboss.naming.client.ejb.context", true);

        Context jndi = new InitialContext(jndiProperties);
        EmployeeManagementService service = (EmployeeManagementService) jndi.lookup("ServerApp/EmployeeManagementServiceImpl!ua.mega.em.service.EmployeeManagementService");

        List<Employee> allEmployees = service.getAllEmployees();
        for (Employee next : allEmployees) {
            System.out.println(next);
        }

    }
}
