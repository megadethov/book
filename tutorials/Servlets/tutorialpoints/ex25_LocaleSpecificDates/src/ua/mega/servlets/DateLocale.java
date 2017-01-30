package ua.mega.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Locale Specific Dates
 * You can use the java.text.DateFormat class and
 * its static getDateTimeInstance( ) method to format date and
 * time specific to locale. Following is the example which shows
 * how to format dates specific to a given locale
 */
public class DateLocale extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response content type
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8"); // it's necessary
        PrintWriter writer = resp.getWriter();
        //Get the client's Locale
        Locale locale = req.getLocale();
        String date = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, locale).format(new Date());

        String title = "Locale Specific Dates";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
        writer.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + date + "</h1>\n" +
                "</body></html>");
    }
}
