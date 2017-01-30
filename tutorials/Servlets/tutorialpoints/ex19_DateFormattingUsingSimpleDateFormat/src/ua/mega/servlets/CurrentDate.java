package ua.mega.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date Formatting using SimpleDateFormat
 * SimpleDateFormat is a concrete class for formatting and parsing dates in a locale-sensitive manner.
 * SimpleDateFormat allows you to start by choosing any user-defined patterns for date-time formatting.
 */
public class CurrentDate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response content type
        resp.setContentType("text/html");

        resp.setCharacterEncoding("UTF-8"); // without this - localization date problem

        PrintWriter writer = resp.getWriter();
        String title = "Display Current Date & Time";
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        writer.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<h2 align=\"center\">" + ft.format(dNow) + "</h2>\n" +
                "</body></html>");
    }
}
