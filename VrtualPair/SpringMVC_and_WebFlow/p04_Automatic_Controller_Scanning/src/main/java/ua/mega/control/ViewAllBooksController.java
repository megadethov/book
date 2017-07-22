package ua.mega.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.mega.domain.Book;
import ua.mega.services.BookService;

import java.util.List;

@Controller
public class ViewAllBooksController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/viewAllBooks")
    public ModelAndView viewAllBooks() {
        List<Book> allBooks = bookService.getEntireCatalogue();
        return new ModelAndView("/displayAllBooks.jsp", "allBooks", allBooks);
    }
}
