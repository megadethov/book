package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxExample {
    private static <T extends Comparable<T>> T max(List<T> list, Comparator<? super T> comparator) {
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) > max) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {

//        List<String> list = new ArrayList<>(Arrays.asList("AA", "BB"));
//        List<Object> list2 = list; // Incompatible types


//        List<String> list = new ArrayList<>(Arrays.asList("AA", "BB"));
//        List<CharSequence> list2 = list; // Incompatible types

//----------КОВАРИАНТНОСТЬ--------------------------------------------
//        List<String> list = new ArrayList<>(Arrays.asList("AA", "BB"));
//        List<? extends CharSequence> list2 = list; // ковариантность ПРЕДОК - НАСЛЕДНИК
//        for (CharSequence cs : list2 ) {
//            System.out.println(cs);
//        }
//        list2.add("12"); // положить в эту коллекцию ничего нельзя, тк <? extends CharSequence> <какой-то extends CharSequence> а какой неизвестно

//----------КОНТРВАРИАНТНОСТЬ--------------------------------------------
        List<String> list = new ArrayList<>(Arrays.asList("AA", "BB"));
        List<? super String> list2 = list; // контрвариантность НАСЛЕДНИК - ПРЕДОК
        for (Object cs : list2 ) {
            System.out.println(cs);
        }
        list2.add("СС"); // теперь в эту коллекцию можно добавлять <? super String> <какой-то super String> стринга и все ее предки

// Comparator - контрвариантен. Если он умеет сравнивать <T>, то он сможет сравнить и всех его предков <? super T>
        List<String> al = new ArrayList<>(Arrays.asList("BBB", "A"));
       String str = max(al, (s1, s2) -> s1.length() - s2.length());
        System.out.println("max = " + str);
    }
}
