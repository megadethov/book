package ua.mega.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.mega.domain.Book;
import ua.mega.services.BookService;

import java.util.List;

public class ViewAllBooksController {

    private BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/viewAllBooks")
    public ModelAndView viewAllBooks() {
        List<Book> allBooks = bookService.getEntireCatalogue();
        return new ModelAndView("/displayAllBooks.jsp", "allBooks", allBooks);
    }
}
