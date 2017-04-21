package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet implements SingleThreadModel {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.print("welcome");
        try {
            Thread.sleep(20000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        out.print(" to servlet");
        out.close();
    }
}
