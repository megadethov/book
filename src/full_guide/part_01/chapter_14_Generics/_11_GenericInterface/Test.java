package full_guide.part_01.chapter_14_Generics._11_GenericInterface;

/**
 * Created by mega on 06.09.2016.
 */

//Обобщенный интерфейс дает два преимущества. Во-первых, он может быть
//        реализован для разных типов данных. И во-вторых, он позволяет наложить ограничения
//        на типы данных, для которых он может быть реализован. В примере интерфейса
//        MinMax вместо параметра типа Т могут быть подставлены только типы
//        классов, реализующих интерфейс Comparable.

public class Test {
    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5};
        Character[] arrChar = {'a', 'b', 'c', 'd'};

        MyClass<Integer> myClass = new MyClass<>(arrInt);
        MyClass<Character> myClass2 = new MyClass<>(arrChar);

        System.out.println(myClass.max() + " " + myClass.min());
        System.out.println(myClass2.max() + " " + myClass2.min());

    }
}


