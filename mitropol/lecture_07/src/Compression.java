import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.zip.GZIPOutputStream;

public class Compression {
    public static void main(String[] args) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKeySpec key = new SecretKeySpec("qhsjdjwieikdnghc".getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);

//        CipherOutputStream cis = new CipherOutputStream(null, null);
        try (FileOutputStream fos = new FileOutputStream("cipher.txt");
             CipherOutputStream cis = new CipherOutputStream(fos, cipher);
             OutputStreamWriter osw = new OutputStreamWriter(cis);
             PrintWriter pw = new PrintWriter(osw))



       /*try( FileOutputStream fos = new FileOutputStream("out.zip");
            GZIPOutputStream gzos = new GZIPOutputStream(fos);
            OutputStreamWriter osw = new OutputStreamWriter(gzos, "UTF-8"); // позволяет задать кодировку, тк PrintWriter - в системной кодировке
            PrintWriter pw = new PrintWriter(osw))*/ {

            pw.println("Hello World");
        }
    }
}