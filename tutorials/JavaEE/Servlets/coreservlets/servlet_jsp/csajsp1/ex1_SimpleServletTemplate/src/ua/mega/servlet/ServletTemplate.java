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
public class ServletTemplate extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// Use "request" to read incoming HTTP headers (e.g. cookies) and HTML form data (query data)
// Use "response" to specify the HTTP response status code and headers (e.g. the content type, cookies).
        PrintWriter out = response.getWriter();
    }
}
