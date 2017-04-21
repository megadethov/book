package ua.mega.servlets;

import ua.mega.beans.Emp;
import ua.mega.dao.EmpDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/viewServlet")
public class ViewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String sPageId = req.getParameter("page");
        int pageId = Integer.parseInt(sPageId);
        int total = 5;
        if (pageId == 1) {
            // NOP
        } else {
            pageId = pageId - 1;
            pageId = pageId * total + 1;
        }

        List<Emp> employees = EmpDao.getRecords(pageId, total);

        out.print("<h1>Page No: " + sPageId + "</h1>");
        out.print("<table border='1' cellpadding='4' width='60%'>");
        out.print("<tr><th>Id</th><th>Name</th><th>Salary</th>");
        for (Emp emp : employees) {
            out.print("<tr><td>" + emp.getId() + "</td><td>" + emp.getName() + "</td><td>" + emp.getSalary() + "</td></tr>");
        }
        out.print("</table>");

        out.print("<a href='viewServlet?page=1'>1</a> ");
        out.print("<a href='viewServlet?page=2'>2</a> ");
        out.print("<a href='viewServlet?page=3'>3</a> ");

        out.close();
    }
}