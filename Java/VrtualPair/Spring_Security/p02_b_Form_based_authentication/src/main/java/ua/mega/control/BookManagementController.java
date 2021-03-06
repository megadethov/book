package ua.mega.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.mega.domain.Book;
import ua.mega.services.BookService;
import ua.mega.views.BookReportExcel;
import ua.mega.views.BookReportPdf;

import java.util.List;

@Controller
public class BookManagementController {

    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

    @RequestMapping("/viewAllBooks")
    public ModelAndView viewAllBooks() {
        List<Book> allBooks = bookService.getEntireCatalogue();
        return new ModelAndView("displayAllBooks", "allBooks", allBooks);
    }

    @RequestMapping("/findByAuthor")
    public ModelAndView findByAuthor(/*@RequestParam("author")*/ String author) {
        List<Book> allBooks = bookService.getAllBooksByAuthor(author);
        return new ModelAndView("displayAllBooks", "allBooks", allBooks);
    }

    @RequestMapping("/viewAllBooksPDF")
    public ModelAndView viewAllBooksPDF() {
        List<Book> allBooks = bookService.getEntireCatalogue();
        return new ModelAndView("BookReportPdf", "allBooks", allBooks);
    }

    @RequestMapping("/viewAllBooksExcel")
    public ModelAndView viewAllBooksExcel() {
        List<Book> allBooks = bookService.getEntireCatalogue();
        return new ModelAndView("BookReportExcel", "allBooks", allBooks);
    }

    @RequestMapping("/looseSearch")
    public @ResponseBody
    List<Book> performLooseSearch(@RequestParam("CHARS") String chars) {
        if (chars.length() < 3) return null;

        return bookService.searchBooksByLooseMatch(chars);
    }
}
