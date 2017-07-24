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
    public ModelAndView show() {
        return new ModelAndView("/add-new-book.jsp", "book", new Book());
    }

}
