package full_guide.part_01.chapter_18_Collections._01_ArrayListDemo;

import java.util.ArrayList;

/**
 * Created by mega on 07.09.2016.
 */
// Продемонстрировать применение класса ArrayList
public class ArrayListDemo {
    public static void main(String[] args) {
        // создать списочный массив
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Start size of al = " + al.size()); // 0

        // ввести элементы в списочный массив
        al.add("CCC");
        al.add("EEE");
        al.add("BBB");
        al.add("DDD");
        al.add("FFF");
        al.add(1, "A2");
        System.out.println("After filling size of al = " + al.size());

        // вывести списочный массив
        System.out.println("al is: " + al);

        // удалить элементы из списочного массива
        al.remove("FFF");
        al.remove(2);
        System.out.println("After remove size of al = " + al.size());
        System.out.println("al is: " + al);
    }
}
//    Ниже приведена
//    общая форма метода ensureCapacity(), где параметр емкость обозначает новую
//    минимальную емкость коллекции.
//        void ensureCapacity(int емкость)
//        С другой стороны, если требуется уменьшить размер базового массива, на основе
//        которого строится объект типа ArrayList, до текущего количества хранящихся
//        в действительности объектов, следует вызвать метод trimToSize(). Ниже
//        приведена общая форма этого метода.
//        void trimToSize()
