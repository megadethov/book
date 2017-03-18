package ua.mega.lecture5;

import java.util.*;

/**
 * Created by Yefremov Yuriy
 */
public class comparableTest {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(600);
        listInt.add(200);
        listInt.add(100);
        listInt.add(400);
        listInt.add(300);
        listInt.add(500);

        Collections.sort(listInt); // сортируем коллекцию утильным методом компаратором реализованным в Integer

        //смотрим отсортированную коллекцию с помощью ListIterator c конца в начало
        ListIterator<Integer> listIter = listInt.listIterator(listInt.size() - 1);
        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous());
        }
        System.out.println("=========================================================================================");

        // Теперь создадим коллекцию объектов MyClass
        List<MyClass> listMyClass = new ArrayList<>();
        listMyClass.add(new MyClass(40));
        listMyClass.add(new MyClass(50));
        listMyClass.add(new MyClass(10));
        listMyClass.add(new MyClass(30));
        listMyClass.add(new MyClass(20));

        Iterator iter = listMyClass.iterator(); // создадим для нее итератор

//        Collections.sort(listMyClass); // не может сравнить, не знает как. MyClass не реализует Comparable или нужен Comparator 2-м аргументом
//        Collections.sort(listMyClass, (a, b) -> a.number - b.number); // даем прямо здесь анонимный компаратор (лямбда) - для double не корректно
//        Collections.sort(listMyClass, (a, b) -> Integer.compare(a.number, b.number)); // а так по все по феншую

        Collections.sort(listMyClass, new MyComparator());
        // посмотрим коллекцию с помощью foreach
        for (MyClass mc : listMyClass) {
            System.out.println(mc);
        }
    }
}

//======================================================================================================================

class MyClass {
    Integer number;

    public MyClass(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "number=" + number +
                '}';
    }
}

class MyComparator implements Comparator<MyClass> {


    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.number - o2.number;
    }
}
