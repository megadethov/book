package ua.mega.control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ua.mega.domain.Book;
import ua.mega.domain.ShoppingCart;
import ua.mega.services.BookService;

@Controller
public class CartManagementController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/addToCart")
    public ModelAndView addToCart(@RequestParam("id") int id, HttpSession session) {

        Book requiredBook = bookService.getBookById(id);

        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart == null) {
            cart = new ShoppingCart();
        }
        cart.addItem(requiredBook);
        session.setAttribute("cart", cart);

        return new ModelAndView("/bookAddedToCart.jsp", "title", requiredBook.getTitle());
    }

    @RequestMapping("/viewCart")
    public ModelAndView viewCart(HttpSession session) {

        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        List<Book> allItems = cart.getAllItems();

        return new ModelAndView("/cartContents.jsp", "cart", allItems);
    }

}
