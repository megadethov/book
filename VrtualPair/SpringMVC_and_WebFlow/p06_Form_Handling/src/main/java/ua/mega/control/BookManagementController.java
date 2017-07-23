package ua.mega.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.mega.domain.Book;
import ua.mega.services.BookService;

import java.util.List;

@Controller
public class BookManagementController {

    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

    @RequestMapping("/viewAllBooks")
    public ModelAndView viewAllBooks() {
        List<Book> allBooks = bookService.getEntireCatalogue();
        return new ModelAndView("/displayAllBooks.jsp", "allBooks", allBooks);
    }

    @RequestMapping("/findByAuthor")
    public ModelAndView findByAuthor(/*@RequestParam("author")*/ String author) {
        List<Book> allBooks = bookService.getAllBooksByAuthor(author);
        return new ModelAndView("/displayAllBooks.jsp", "allBooks", allBooks);
    }
}
