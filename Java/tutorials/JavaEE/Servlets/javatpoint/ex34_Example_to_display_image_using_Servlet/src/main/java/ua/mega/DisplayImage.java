package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DisplayImage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("image/jpeg");
        ServletOutputStream out = resp.getOutputStream();
        FileInputStream fis = new FileInputStream("d:\\java\\book\\tutorials\\JavaEE\\Servlets\\javatpoint\\ex34_Example_to_display_image_using_Servlet\\src\\main\\resources\\map.jpg");

        BufferedInputStream bin = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(out);

        int ch = 0;
        while ((ch = bin.read()) != -1) {
            bos.write(ch);
        }
        bin.close();
        fis.close();
        bos.close();
        out.close();
    }
}
