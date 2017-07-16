package ua.mega.avalon.data;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.avalon.domain.Book;
import ua.mega.avalon.services.BookService;

import static org.junit.Assert.*;

/**
 * A JUnit4 test to integration test the Spring Container setup
 */

public class BookDaoJpaImplTest {

    @Test
    public void testFindByIsbn() throws Exception {
        // arrange
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
        BookService bookService = (BookService) container.getBean("bookService");

        String isbn = "7326837268237";
        Book addingBook = new Book(isbn, "Java Puzzles", "Josh Bloch", 10.99);
        bookService.registerNewBook(addingBook);
        // act
        Book findingBook = bookService.getBookByIsbn(isbn);
        // assert
        assertEquals("Book not found", addingBook, findingBook);
    }

    @Test
    public void testAddingBooks() throws Exception {
        // arrange
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
        BookService bookService = (BookService) container.getBean("bookService");

        bookService.registerNewBook(new Book("494949484748", "Java Programming", "Gary Cornell", 10.99));
        bookService.registerNewBook(new Book("5151515484748", "Effective Java", "Josh Bloch", 20.99));
        // act
        int booksInDb = bookService.getEntireCatalogue().size();
        // assert
        assertEquals(2, booksInDb);
    }

    @Test(expected = BookNotFoundException.class)
    public void testFindingNonExistentBook() throws BookNotFoundException {
        // arrange
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
        BookService bookService = (BookService) container.getBean("bookService");
        // act
        Book fakeIsbn = bookService.getBookByIsbn("fake isbn"); // BookNotFoundException
        // assert
    }
}