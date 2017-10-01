package ua.mega.avalon.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.avalon.domain.Book;
import ua.mega.avalon.services.BookService;
import ua.mega.avalon.services.PurchasingService;

public class Client {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("other-tiers.xml");
        try {
            PurchasingService purchasing = container.getBean(PurchasingService.class);
            BookService bookService = (BookService) container.getBean("bookService");

            bookService.registerNewBook(new Book("494949484748", "Java Programming", "Gary Cornell", 10.99));
            bookService.registerNewBook(new Book("5151515484748", "Effective Java", "Josh Bloch", 20.99));

            List<Book> allBooks = bookService.getAllBooksByAuthor("Josh Bloch");

            for (Book book : allBooks) {
                System.out.println(book);
            }
        } finally {
            container.close();
        }

    }
}
