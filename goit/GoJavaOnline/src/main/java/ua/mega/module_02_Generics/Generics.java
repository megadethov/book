package ua.mega.module_02_Generics;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Generics {

    @Test
   public void testGenericsTypeSafe() {
       List<Integer> ints = Arrays.asList(10, 20, 3); // компилятор следит за типами
        for (Object anInt : ints) {
            System.out.println(anInt); // кастовать не нужно
        }

    }

    @Test
    public void yestGenericSubtypes() {
        List<Number> numbers;
        List<Integer> integers = Arrays.asList(10, 20, 30);
//        numbers = integers; // полиморфизм в Generics не работает
    }
}
