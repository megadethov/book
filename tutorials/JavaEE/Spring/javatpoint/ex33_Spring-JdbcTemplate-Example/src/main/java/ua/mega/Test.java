package ua.mega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDao dao = (EmployeeDao) context.getBean("eDao");

//        int status = dao.saveEmployee(new Employee(102, "Amit", 35000));
//        System.out.println(status);

//        dao.updateEmployee(new Employee(102, "Yuriy", 50000));

        dao.deleteEmployee(new Employee(102));
    }
}
