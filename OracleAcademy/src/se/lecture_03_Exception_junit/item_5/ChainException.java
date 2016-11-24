package se.lecture_03_Exception_junit.item_5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ChainException {
    public static void main(String[] args) {
        try {
            exChain();
        } catch (FileNotFoundException e) {
            System.out.println(e); // перехваченное исключение
            System.out.println(e.getCause()); // его причина
        }
    }

    private static void exChain() throws FileNotFoundException {
        FileNotFoundException ex = new FileNotFoundException("My FNF Exception");
        ex.initCause(new IOException("My IO Exception")); // установили причиной FileNotFoundException - IOException (only 1 раз)
        throw ex; // бросили
    }
}
