package ua.mega.hibernate.jdbc2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.hibernate.jdbc2.controllers.EmployeeController;

public class Main2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main2.class);

   private EmployeeController employeeController;

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Main2 main2 = applicationContext.getBean(Main2.class);
        main2.start();
    }

    private void start() {
//        employeeController.getAllEmployees().forEach(System.out::println);
        System.out.println(employeeController.getEmployeeById(1));
    }

    public void setEmployeeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }
}