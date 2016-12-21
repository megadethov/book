import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CipherOneKey {
    public static void main(String[] args) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKeySpec key = new SecretKeySpec("qhsjdjwieikdnghc".getBytes(), "AES");


//        Пишем данные в зашифрованном виде в файл
        cipher.init(Cipher.ENCRYPT_MODE, key);
        try (FileOutputStream fos = new FileOutputStream("cipher.txt");
             CipherOutputStream cis = new CipherOutputStream(fos, cipher);
             OutputStreamWriter osw = new OutputStreamWriter(cis);
             PrintWriter pw = new PrintWriter(osw)) {
            pw.println("Hello World");
        }

        //        Считываем зашифрованные данные
        cipher.init(Cipher.DECRYPT_MODE, key);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new CipherInputStream(new FileInputStream("cipher.txt"), cipher)));
        System.out.println(bufferedReader.readLine());
    }
}