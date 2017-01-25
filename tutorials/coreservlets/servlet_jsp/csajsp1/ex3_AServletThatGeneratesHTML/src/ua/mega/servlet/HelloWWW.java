package ua.mega.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by mega
 */
public class HelloWWW extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String docType = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n";
        printWriter.println(docType + "<html>" +
                "<head>" +
                "<title>Hello WWW</title>" +
                "</head>" +
                "<body>" +
                "<h1>Hello WWW</h1>" +
                "</body>" +
                "</html>");
    }
}
