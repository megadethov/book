package ua.mega.servlets;

import ua.mega.domain.Book;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ViewCartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        out.print("<html><body><h1>Your Cart</h1><ul>");
        HttpSession session = req.getSession();
        List<Book> cart = (List<Book>) session.getAttribute("cart");
        if (cart != null) {
            for (Book next : cart) {
                out.print("<li>" + next.getTitle() + " : $" + next.getPrice() + "</li>");
            }
        }


        out.print("</ul></body></html>");

        out.close();
    }
}
