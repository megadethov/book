package ua.mega.avalon.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.avalon.data.BookDao;
import ua.mega.avalon.data.BookNotFoundException;
import ua.mega.avalon.domain.Book;
import ua.mega.avalon.services.BookService;
import ua.mega.avalon.services.PurchasingService;

public class Client {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");

        BookService bookService = container.getBean("bookService", BookService.class);

        bookService.registerNewBook(new Book("12345", "It", "Stiven King", 19.99));
        List<Book> books = bookService.getEntireCatalogue();
        for (Book next : books) {
            System.out.println(next);
        }

        try {
            bookService.getBookByIsbn("fake isbn");
        } catch (BookNotFoundException e) {
            System.out.println("Sorry, that book does't exist.");
        }

        container.close();
    }
}
