package ua.mega.avalon.data;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ua.mega.avalon.domain.Book;
import ua.mega.avalon.services.BookService;

import static org.junit.Assert.*;

/**
 * A JUnit4 test to integration test the Spring Container setup
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application.xml")
public class BookDaoJpaImplTest {

    @Autowired
    BookService bookService;
/*
    @Before
    public void setUp() {
        // arrange
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
        bookService = (BookService) container.getBean("bookService");
    }
*/

    @Test
    public void testFindByIsbn() throws Exception {
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
        bookService.registerNewBook(new Book("494949484748", "Java Programming", "Gary Cornell", 10.99));
        bookService.registerNewBook(new Book("5151515484748", "Effective Java", "Josh Bloch", 20.99));
        // act
        int booksInDb = bookService.getEntireCatalogue().size();
        // assert
        assertEquals(2, booksInDb);
    }

    @Test(expected = BookNotFoundException.class)
    public void testFindingNonExistentBook() throws BookNotFoundException {
        // act
        Book fakeIsbn = bookService.getBookByIsbn("fake isbn"); // BookNotFoundException
        // assert
    }
}