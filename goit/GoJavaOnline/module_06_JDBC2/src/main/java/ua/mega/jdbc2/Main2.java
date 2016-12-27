package ua.mega.jdbc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.jdbc2.model.EmployeeDao2;
import ua.mega.jdbc2.model.jdbc.JdbcEmployeeDao2;

public class Main2 {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        EmployeeDao2 employeeDao2 = (EmployeeDao2) applicationContext.getBean("employeeDao2");


        System.out.println("All employees:");
        employeeDao2.getAll().forEach(System.out::println);

        System.out.println("Employee with id " + 3);
        System.out.println(employeeDao2.load(3));

    }
}