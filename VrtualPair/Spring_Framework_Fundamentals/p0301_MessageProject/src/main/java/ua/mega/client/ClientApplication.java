package ua.mega.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.motd.MessageOfTheDayBasicImpl;
import ua.mega.motd.MessageOfTheDayService;

public class ClientApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
        MessageOfTheDayService service = container.getBean("motdServise", MessageOfTheDayBasicImpl.class);

        System.out.println(service.getTodayMessage());

        container.close();
    }
}
