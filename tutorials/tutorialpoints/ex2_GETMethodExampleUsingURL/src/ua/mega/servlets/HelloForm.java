package ua.mega.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by mega
 */
public class HelloForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        String title = "Using GET Method to Read Form Data";

        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";

        writer.println(
                docType +  "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body bgcolor=\"#f0f0f0\">\n" +
                        "<h1 align=\"center\">" + title + "</h1>\n" +
                        "<ul>\n" +
                        "<li><b>First name</b>: " + req.getParameter("first_name") + "\n" +
                        "<li><b>Last name</b>: " + req.getParameter("last_name") + "\n" +
                        "</ul>\n" +
                        "</body></html>");
    }
}
