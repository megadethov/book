package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ServletPDF extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("application/pdf");
        resp.setHeader("Content-disposition","inline; filename='javatpoint.pdf'");

        // TODO: 23.04.2017 I have not maven dependency for PDF 
    }
}
