package ua.mega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp03 {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext
                ("d:\\java\\book\\tutorials\\Spring\\tutorialspoint\\ex03_application-context-container\\src\\main\\resources\\Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }
}
