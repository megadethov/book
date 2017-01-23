package ua.mega;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class FileLoadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileLocation = "D:\\secret.txt";	//change the path according to you
        File file = new File(fileLocation);
        FileInputStream fis = new FileInputStream(file);
        ServletOutputStream sos = resp.getOutputStream();

        resp.setContentType("application/octet-stream");
        resp.setHeader("Content-Disposition", "attachment;filename=" + fileLocation);

        byte[] buffer = new byte[4096];

        while((fis.read(buffer, 0, 4096)) != -1){
            sos.write(buffer, 0, 4096);
        }

        fis.close();

    }
}
