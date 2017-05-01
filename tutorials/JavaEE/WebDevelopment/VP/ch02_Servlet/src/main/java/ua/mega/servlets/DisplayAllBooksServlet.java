package ua.mega.servlets;

import ua.mega.domain.Book;
import ua.mega.services.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DisplayAllBooksServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        // do some work
        BookService bookService = new BookService();
        List<Book> allBooks = bookService.getEntireCatalogue();
        // output the result page
        out.print("<html><head><title>Our entire catalogue</title>");
        out.print("<body><h1>Our entire catalogue</h1>");
        out.print("<ul>");
        for (Book next : allBooks) {
            out.print("<li>");
            out.print(next.getTitle());
            out.print("</li>");
        }
        out.print("</ul>");
        out.print("</body></html>");

        out.close();
    }
}
