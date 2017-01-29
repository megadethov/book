package ua.mega.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/**
 * Servlets - Internationalization
 * This example shows how you display a language and associated country for a request
 */
public class GetLocale extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Get the client's Locale
        Locale locale = req.getLocale();
        String language = locale.getLanguage();
        String country = locale.getCountry();

        // Set response content type
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String title = "Detecting Locale";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";

        writer.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + language + "</h1>\n" +
                "<h2 align=\"center\">" + country + "</h2>\n" +
                "</body></html>");
    }
}
