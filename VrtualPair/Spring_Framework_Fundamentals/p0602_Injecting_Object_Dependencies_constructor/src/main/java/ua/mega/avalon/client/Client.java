package ua.mega.avalon.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.avalon.domain.Book;
import ua.mega.avalon.services.BookService;
import ua.mega.avalon.services.PurchasingService;

public class Client {
    public static void main(String[] args) {

        System.out.println("Testing buying a book....");
        String requiredIsbn = "ISBN1"; // we know this isbn is present in the mock

        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");

        PurchasingService purchasingService = container.getBean("purchasingService", PurchasingService.class);
        purchasingService.buyBook(requiredIsbn);

        container.close();
    }
}
