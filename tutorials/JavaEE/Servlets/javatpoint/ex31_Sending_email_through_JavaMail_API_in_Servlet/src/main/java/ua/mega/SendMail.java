package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SendMail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String to=req.getParameter("to");
        String subject=req.getParameter("subject");
        String msg=req.getParameter("msg");

        Mailer.send(to, subject, msg);
        out.print("message has been sent successfully");
        out.close();
    }
}
