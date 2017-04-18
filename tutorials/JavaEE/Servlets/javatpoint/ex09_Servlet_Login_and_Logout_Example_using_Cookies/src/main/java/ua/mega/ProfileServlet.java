package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();


        Cookie[] cookies = req.getCookies();
        String userName = req.getParameter("userName");
        System.out.println("ProfileServlet = " + userName);

        req.getRequestDispatcher("link.html").include(req, resp);
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                String name = cookies[i].getName();
                if (name.equals("name")) {
                   String value = cookies[i].getValue();
                    if (value.equals("Mega")) {
                        writer.print("<b>Welcome to Profile</b>");
                        writer.print("<br>Welcome, " + "Mega");
                    }else {
                        writer.print("<br/>Please login first");
                        req.getRequestDispatcher("login.html").include(req, resp);
                    }
                    break;
                } // end if name
            } // end for
        } else {
            writer.print("<br/>Please login first");
            req.getRequestDispatcher("login.html").include(req, resp);
        }
        writer.close();
    }


}
