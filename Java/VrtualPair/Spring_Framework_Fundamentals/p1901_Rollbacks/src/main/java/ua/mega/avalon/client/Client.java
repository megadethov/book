package ua.mega.avalon.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.avalon.data.BookDao;
import ua.mega.avalon.data.BookNotFoundException;
import ua.mega.avalon.domain.Book;
import ua.mega.avalon.services.BookService;
import ua.mega.avalon.services.CustomerCreditExcededException;
import ua.mega.avalon.services.PurchasingService;

public class Client {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");

        try {
            PurchasingService purchasing = container.getBean(PurchasingService.class);
            BookService bookService = container.getBean(BookService.class);

            // begin
            bookService.registerNewBook(new Book("10003993939", "Test Title", "Author", 10.99));
            // commit

            // begin
            try {
                purchasing.buyBook("10003993939");
            } catch (BookNotFoundException e) {
                System.out.println("Sorry, that book doesn't exist");
            } catch (CustomerCreditExcededException e) {
                System.out.println("You can't do this");
            }
            // commit

        } finally {
            container.close();
        }
    }
}
