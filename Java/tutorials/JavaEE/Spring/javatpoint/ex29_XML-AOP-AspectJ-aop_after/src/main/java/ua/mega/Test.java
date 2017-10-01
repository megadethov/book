package ua.mega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Operation operation = (Operation) context.getBean("opBean");

        System.out.println("calling msg...");
        operation.msg();
        System.out.println("calling m...");
        operation.m();
        System.out.println("calling k...");
        operation.k();
    }
}
