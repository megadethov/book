import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Compression {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("out.zip");
        GZIPOutputStream gzos = new GZIPOutputStream(fos);
        OutputStreamWriter osw = new OutputStreamWriter(gzos, "UTF-8");
        PrintWriter pw = new PrintWriter(osw);
    }
}