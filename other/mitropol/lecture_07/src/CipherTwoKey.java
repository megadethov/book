import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.*;

// Ассиметричное шифрование - 2 ключа. Еще называют - шифрование с открытым ключем
// Public ключ распространяется в открытом виде - для шифрования
// Private ключ есть только у вас для расшифровки
// А в электронной подписи наоборот на чтение - публичный ключ, а на создание подписи - приватный.
// Для избежания перехвата и подмены публичного ключа, надо использовать
// SSL - secure socket level   TTS - transport level security
public class CipherTwoKey {
    public static void main(String[] args) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {

        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        KeyPairGenerator keyPG = KeyPairGenerator.getInstance("RSA");
        KeyPair pair = keyPG.genKeyPair();
        PublicKey aPublic = pair.getPublic();
        PrivateKey aPrivate = pair.getPrivate();






//        SecretKeySpec key = new SecretKeySpec("qhsjdjwieikdnghc".getBytes(), "AES"); // это нам уже не нужно


//        Пишем данные в зашифрованном виде в файл
        cipher.init(Cipher.ENCRYPT_MODE, aPublic); // шифруем публичным ключем
        try (FileOutputStream fos = new FileOutputStream("cipher.txt");
             CipherOutputStream cis = new CipherOutputStream(fos, cipher);
             OutputStreamWriter osw = new OutputStreamWriter(cis);
             PrintWriter pw = new PrintWriter(osw)) {
            pw.println("Hello World");
        }

        //        Считываем зашифрованные данные
        cipher.init(Cipher.DECRYPT_MODE, aPrivate); // расшифровываем приватным ключем
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new CipherInputStream(new FileInputStream("cipher.txt"), cipher)));
        System.out.println(bufferedReader.readLine());
    }
}