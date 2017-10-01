package ua.mega.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.mega.domain.Book;
import ua.mega.services.BookService;

@Controller
public class CreateBookController {

    @Autowired
    BookService bookService;

    @RequestMapping("addNewBook")
    public ModelAndView addNewBook(String isbn, String title, String author, String price) {
        double doublePrice = new Double(price);
        Book theBook = new Book(isbn, title, author, doublePrice);
        bookService.registerNewBook(theBook);

        return new ModelAndView("/book-added.jsp", "title", title);
    }

}
