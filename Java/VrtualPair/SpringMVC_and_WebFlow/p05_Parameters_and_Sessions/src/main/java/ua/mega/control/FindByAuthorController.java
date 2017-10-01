package ua.mega.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.mega.domain.Book;
import ua.mega.services.BookService;

import java.util.List;

@Controller
public class FindByAuthorController {

    @Autowired
    BookService bookService;

    @RequestMapping("/findByAuthor")
    public ModelAndView findByAuthor(/*@RequestParam("author")*/ String author) {
        List<Book> allBooks = bookService.getAllBooksByAuthor(author);
        return new ModelAndView("/displayAllBooks.jsp", "allBooks", allBooks);
    }
}
