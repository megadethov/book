package ua.mega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Operation operation = (Operation) context.getBean("opBean");

        System.out.println("calling validate...");
        try {
            operation.validate(19);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println();
        }
        System.out.println("calling validate again...");
        try {
            operation.validate(11);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
