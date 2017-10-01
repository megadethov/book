package ua.mega;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CountUserListener implements HttpSessionListener {

    ServletContext ctx = null;
    static int total = 0;
    static int current = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        total++;
        current++;

        ctx = se.getSession().getServletContext();
        ctx.setAttribute("totalusers", total);
        ctx.setAttribute("currentusers", current);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        current--;
        ctx.setAttribute("currentusers", current);
    }
}
