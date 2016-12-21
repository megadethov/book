import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

public class Compression {
    public static void main(String[] args) throws IOException {

        try (FileOutputStream fos = new FileOutputStream("out.zip");
             GZIPOutputStream gzos = new GZIPOutputStream(fos);
             OutputStreamWriter osw = new OutputStreamWriter(gzos, "UTF-8"); // позволяет задать кодировку, тк PrintWriter - в системной кодировке
             PrintWriter pw = new PrintWriter(osw)) {

            pw.println("Hello World");
        }

    }
}