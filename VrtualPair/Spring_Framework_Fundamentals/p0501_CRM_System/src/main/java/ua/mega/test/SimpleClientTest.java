package ua.mega.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.domain.Customer;
import ua.mega.services.customers.CustomerManagementService;
import ua.mega.services.diary.DiaryManagementService;

import java.util.List;

public class SimpleClientTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");

        CustomerManagementService customerManagementService = container.getBean("customerManagementService", CustomerManagementService.class);

        DiaryManagementService diaryManagementService = container.getBean("diaryManagementService", DiaryManagementService.class);

        List<Customer> allCustomers = customerManagementService.getAllCustomers();
        for (Customer next : allCustomers) {
            System.out.println(next);
        }
        container.close();
    }
}
