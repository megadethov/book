package ua.mega;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp27 {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
        hw.getMessage();

        context.registerShutdownHook();
    }
}
