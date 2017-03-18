package se.lecture_06_Generics.item_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Double> listDouble = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();
        listDouble.add(2.0);
        listInteger.add(1);

        Number sumDouble = sum(listDouble);
        Number sumInteger = sum(listInteger);
//        sum(new ArrayList<String>(Arrays.asList("a"))); // ошибка компиляции, String не наследует Number

        System.out.println(sumDouble);
        System.out.println(sumInteger);



    }

    // тк прямой полиморфизм в Generics типах не работает - это альтернатива. Тип = Number и все его наследники
    public static Number sum(List<? extends Number> listNumbers) {
        Double result = 0.0;
        for (Number num : listNumbers) {
            result += num.doubleValue();
        }
        return result;
    }
}
