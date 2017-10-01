package ua;

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
    public void testGenericSubtypes() {
        List<Number> numbers;
        List<Integer> integers = Arrays.asList(10, 20, 30);
//        numbers = integers; // полиморфизм в Generics не работает

    }

    @Test
    public void testArraysSubtypes() {
        Number[] numbers;
        Integer[] integers = new Integer[]{10, 20, 30};
        numbers = integers; // ошибки нет
        numbers[2] = 10.3; // нет ошибки компиляции, но ошибка в runtime - java.lang.ArrayStoreException: java.lang.Double

    }
}
