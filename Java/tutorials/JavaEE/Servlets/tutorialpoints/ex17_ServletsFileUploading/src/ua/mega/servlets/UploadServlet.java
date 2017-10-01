package ua.mega.servlets;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/**
 * UploadServlet which can handle multiple file uploading at a time
 */
public class UploadServlet extends HttpServlet {
    private  boolean isMultipart;
    private String filePath;
    private int maxFileSize = 50 * 1024;
    private int maxMemSize = 4 * 1024;
    private File file ;

    @Override
    public void init() throws ServletException {
        // Get the file location where it would be stored.
        filePath = getServletContext().getInitParameter("file-upload");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Check that we have a file upload request
        isMultipart = ServletFileUpload.isMultipartContent(req);
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        if (!isMultipart) {
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>Servlet upload</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<p>No file uploaded</p>");
            writer.println("</body>");
            writer.println("</html>");
            return;
        }

        DiskFileItemFactory factory = new DiskFileItemFactory();
        // maximum size that will be stored in memory
        factory.setSizeThreshold(maxMemSize);
        // Location to save data that is larger than maxMemSize.
        factory.setRepository(new File("c:\\temp"));

        // Create a new file upload handler
        ServletFileUpload upload = new ServletFileUpload(factory);
        // maximum file size to be uploaded.
        upload.setSizeMax(maxFileSize);

        try {
            // Parse the request to get file items.
            List fileItems = upload.parseRequest(req);

            // Process the uploaded file items
            Iterator iter = fileItems.iterator();

            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>Servlet upload</title>");
            writer.println("</head>");
            writer.println("<body>");

            while ( iter.hasNext () )
            {
                FileItem fi = (FileItem)iter.next();
                if ( !fi.isFormField () )
                {
                    // Get the uploaded file parameters
                    String fieldName = fi.getFieldName();
                    String fileName = fi.getName();
                    String contentType = fi.getContentType();
                    boolean isInMemory = fi.isInMemory();
                    long sizeInBytes = fi.getSize();
                    // Write the file
                    if( fileName.lastIndexOf("\\") >= 0 ){
                        file = new File( filePath +
                                fileName.substring( fileName.lastIndexOf("\\"))) ;
                    }else{
                        file = new File( filePath +
                                fileName.substring(fileName.lastIndexOf("\\")+1)) ;
                    }
                    fi.write( file ) ;
                    writer.println("Uploaded Filename: " + fileName + "<br>");
                }
            }
            writer.println("</body>");
            writer.println("</html>");
        } catch (Exception e) {
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        throw new ServletException("GET method used with " +
                getClass( ).getName( )+": POST method required.");
    }
}
