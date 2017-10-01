package ua.mega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp10 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloIndia obj = (HelloIndia) context.getBean("helloIndia");

        obj.getMessage1();
        obj.getMessage2();
        obj.getMessage3();
    }
}
