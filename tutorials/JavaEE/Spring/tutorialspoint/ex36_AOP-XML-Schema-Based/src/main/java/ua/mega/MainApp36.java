package ua.mega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp36 {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");

        Student student = (Student) context.getBean("student");

        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
