package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/viewServlet")
public class ViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<a href='index.html'>Add New Employee</a>");
        out.println("<h1>Employees List</h1>");

        List<Emp> employees = EmpDao.getAllEmployees();

        out.print("<table border='1' width='70%'");
        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
        for (Emp emp : employees) {
            out.print("<tr><td>"+emp.getId()+"</td><td>"+emp.getName()+"</td><td>"+emp.getPassword()+"</td><td>"+emp.getEmail()+"</td><td>"+emp.getCountry()+"</td><td><a href='editServlet?id="+emp.getId()+"'>edit</a></td><td><a href='deleteServlet?id="+emp.getId()+"'>delete</a></td></tr>");
        }

        out.print("</table>");

        out.close();
    }
}
