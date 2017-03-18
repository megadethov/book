package full_guide.part_01.chapter_14_Generics._09_GenericMethod;

/**
 * Created by mega on 04.09.2016.
 */
// продемонстрировать простой обобщенный метод
// обобщенные методы могут быть static, в отличие от полей

public class DemoGenericMethod { // класс не является обобщенным

    // определить содержится ли объект в массиве
//    static <T, V> boolean isIn(T obj, V[] arr) { // упрощенная форма для понимания
    // тип T должен быть Comparable или подтип для того, чтобы объекты можно было сравнивать
    // в свою очередь Comparable параметризирован тем же типом <T>, чтобы сравнивались одинаковые типы
    // тип V - граничен сверху типом T, чтобы в массив могли помещаться только объекты типа T и его подтипы
    static <T extends Comparable<T>, V extends T> boolean isIn(T obj, V[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (obj.compareTo(arr[i]) == 0) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Integer[] arrInt = {10, 20, 30, 40, 50};
        String[] arrStr = {"one", "two", "three", "four", "five"};

        // применить метод isIn для поиска в массиве целых чисел
        System.out.println(isIn(30, arrInt)); // не требует явного указания типов T, V - автоподстановка

        // применить метод isIn для поиска в массиве строк
        System.out.println(isIn("five", arrStr)); // не требует явного указания типов T, V - автоподстановка

//        isIn("one", arrInt); // compile error, типы должны быть совместимыми
    }
}
