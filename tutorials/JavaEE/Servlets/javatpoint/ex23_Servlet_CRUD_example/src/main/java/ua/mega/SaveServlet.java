package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/saveServlet")
public class SaveServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String country = req.getParameter("country");

        Emp emp = new Emp();
        emp.setName(name);
        emp.setPassword(password);
        emp.setEmail(email);
        emp.setCountry(country);

        int status = EmpDao.save(emp);

        if (status > 0) {
            writer.print("<p>Record saved successfully!</p>");
        } else {
            writer.println("Sorry! unable to save record");
        }
        writer.close();
    }
}
