package ua.mega.servlets;

import ua.mega.domain.Book;
import ua.mega.services.BookService;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddNewBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");

        String isbn = req.getParameter("isbn");
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        double price = Double.parseDouble(req.getParameter("price"));

        Book newBook = new Book(isbn, title, author, price);

        BookService service = BookService.getService();
        service.registerNewBook(newBook);

        // render response
        out.print("<html><head><title>Add new Book</title>");
        out.print("<body><h1>Book " + title + " has added</h1>");
        out.print("</body></html>");

        out.close();
    }
}
