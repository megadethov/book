package ua.mega.servlets;

import ua.mega.domain.Book;
import ua.mega.services.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AddToCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        String id = req.getParameter("id");
//        out.println("You are adding the book with id " + id);
        Book requiredBook = BookService.getService().getBookById(Integer.parseInt(id));
        HttpSession session = req.getSession();
        List<Book> cart = (List<Book>) session.getAttribute("cart");

        if (cart == null) {
            // this is the first visit (of this servlet) by this User
            cart = new ArrayList<>();
        }
        cart.add(requiredBook);
        session.setAttribute("cart", cart);
        out.print("<h1>Thank you</h1><p>You have added the book to your cart</p>");

        out.close();
    }
}
