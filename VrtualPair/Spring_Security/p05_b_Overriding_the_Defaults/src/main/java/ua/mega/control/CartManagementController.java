package ua.mega.control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ua.mega.domain.Book;
import ua.mega.domain.ShoppingCart;
import ua.mega.services.BookService;

@Controller
@Scope("request")
public class CartManagementController {
    @Autowired
    @Qualifier("bookService")
    private BookService bookService;
    @Autowired
    private ShoppingCart cart;

    @RequestMapping("/addToCart")
    public ModelAndView addToCart(@RequestParam("id") int id) {
        Book requiredBook = bookService.getBookById(id);
        cart.addItem(requiredBook);
        return new ModelAndView("bookAddedToCart", "title", requiredBook.getTitle());
    }

    @RequestMapping("/viewCart")
    public ModelAndView viewCart() {
        List<Book> allItems = cart.getAllItems();
        return new ModelAndView("cartContents", "cart", allItems);
    }

}
