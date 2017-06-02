package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionsExample {
    public static void main(String[] args) throws FileNotFoundException {


        try(PrintWriter printWriter = new PrintWriter(new File("out.txt"));) {
            printWriter.println("Hello");
            printWriter.println("World!");
        }
    }

    public static void checkPassword(String password) throws IllegalAccessException {
//        if (!password.equals("1234")) // черевато NPE?, если password = null
        if (!"1234".equals(password)) throw new IllegalAccessException("wrong password");
    }
}
