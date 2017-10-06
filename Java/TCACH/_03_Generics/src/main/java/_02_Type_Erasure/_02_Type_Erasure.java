package _02_Type_Erasure;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class _02_Type_Erasure {
    public static void main(String[] args) {
        // Какой из методов будет вызван?
        SomeType someType = new SomeType();
        List<String> list = Arrays.asList("value");
//        someType.test(list); // ClassCastException - тк сырой тип и вызывается наиболее подходящий метод - List

        // Решение - генерализируй хоть чем нибудь - <?>, <Object>
        SomeType<?> someType2 = new SomeType();
        someType2.test(list); // value - теперрь вызовется метод - Collection<E>
    }
    // Если ничего не указать - компилятор будеть игнорить все дженерики.
    // Не юзай сырой тип - указывай хоть что-нибудь.
}

class SomeType<T> {
    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
        }
    }

    public void test(List<Integer> integerList) {
        for (Integer i : integerList) {
            System.out.println(i);
        }
    }
}