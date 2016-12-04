package ua.mega.module_02_Generics;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Generics {

    @Test
   public void testGenericsTypeSafe() {
       List ints = Arrays.asList(10, 20.3);
        for (Object anInt : ints) {
            Integer i = (Integer) anInt;
            System.out.println(i);
        }

    }
}
