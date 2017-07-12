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
            BookService bookService = (BookService) container.getBean("bookService");

            bookService.registerNewBook(new Book("494949484748", "Java Programming", "Gary Cornell", 10.99));

            List<Book> allBooks = bookService.getAllBooksByAuthor("Josh Bloch");

            for (Book book : allBooks) {
                System.out.println(book);
            }
        } finally {
            container.close();
        }

    }
}
