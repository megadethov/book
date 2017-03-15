package ua.mega;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp35 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        CustomEventPublisher cep = (CustomEventPublisher) context.getBean("customEventPublisher");
        cep.publish();
        cep.publish();
    }
}
