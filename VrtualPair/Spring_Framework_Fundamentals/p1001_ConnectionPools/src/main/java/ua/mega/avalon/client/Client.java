package ua.mega.avalon.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.avalon.data.BookDao;
import ua.mega.avalon.domain.Book;
import ua.mega.avalon.services.BookService;
import ua.mega.avalon.services.PurchasingService;

public class Client {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");

        BookDao bookDao = container.getBean("bookDao", BookDao.class);

        bookDao.create(new Book("12345", "It", "Stiven King", 19.99));
        List<Book> books = bookDao.allBooks();
        for (Book next : books) {
            System.out.println(next);
        }


        container.close();
    }
}
