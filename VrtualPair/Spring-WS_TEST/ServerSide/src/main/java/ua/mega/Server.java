package ua.mega;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.domain.User;
import ua.mega.services.UserManagementService;
import ua.mega.services.UserNotFound;

public class Server {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
        UserManagementService manager = (UserManagementService) container.getBean("userNanagementService");

        manager.registerNewUser(new User("1", "First"));
        manager.registerNewUser(new User("2", "Second"));

        try {
            System.out.println(manager.getUserById("1").getName());
        } catch (UserNotFound userNotFound) {
            userNotFound.printStackTrace();
        }
    }
}
