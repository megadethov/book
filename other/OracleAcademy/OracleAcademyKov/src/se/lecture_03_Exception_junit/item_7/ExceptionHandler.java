package se.lecture_03_Exception_junit.item_7;

import java.io.IOException;

public class ExceptionHandler {
    public static void main(String[] args) {
 //=================================================================
        // compile error
        try {
            throw new RuntimeException();
//            System.out.println("hello"); // unreachable statement
        } catch (Exception e) {
        }
 //=================================================================
        // скомпилируется
        try {
            System.out.println("hello"); // компилятор вычислит, что отсюда может вылететь и RuntimeException
        } catch (Exception e) {
        }
//=================================================================
        // compile error
//        try {
//            System.out.println("hello");
//        } catch (IOException e) { // компилятор вычислил, что IOException никогда не вылетит из try
//        }
    }
}
