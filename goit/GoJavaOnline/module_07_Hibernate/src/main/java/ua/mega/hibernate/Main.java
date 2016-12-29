package ua.mega.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context", "hibernate-context");
        Main main = applicationContext.getBean(Main.class);
        main.start();
    }

    private void start() {

    }
}
