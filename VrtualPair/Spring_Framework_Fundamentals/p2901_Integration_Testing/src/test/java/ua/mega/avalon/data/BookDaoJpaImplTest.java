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
    }

    @Test
    public void testFindingNonExistentBook() throws Exception {
    }
}