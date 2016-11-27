package se.lecture_04_Collection.item_5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        String str = "abcba"; // проверяемая на палиндромность строка
        List<Character> palindrome = new LinkedList<>();
        // закидываем в лист строку в чарах
        for(char ch : str.toCharArray()) {
            palindrome.add(ch);
        }
        System.out.println("Input String is: " + palindrome); // исходный лист чаров

        // создаем Iterator - для проямого прохода
        Iterator<Character> iter = palindrome.iterator();
        // и ListIterator - для обратного прохода
        ListIterator<Character> listIterator = palindrome.listIterator(palindrome.size()); // ставим указатель на позицию перед последним элемнтом

        boolean result = true;

        // Идем двумя итераторами с концов и посимвольно их сравниваем
        while (iter.hasNext() && listIterator.hasPrevious()) {
            if (iter.next() != listIterator.previous()) result = false;
        }

        if (result) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }



    }
}
