package _03_Inheritance_and_Generics;

import java.util.ArrayList;
import java.util.List;

public class _03_Inheritance_and_Generics {
    public static void main(String[] args) {
        List<String> lstr = new ArrayList<>();
//        List<Object> lobj = lstr; // compile error

        // String является Object
        // List<String> не является List<Object>
        // List<String>, List<Object> являются Object

        // По одному типу наследование допускается:
        // ArrayList<String> является List<String> является Collection<String>

    }
}
