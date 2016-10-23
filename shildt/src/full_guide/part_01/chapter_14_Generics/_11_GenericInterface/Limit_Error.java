package full_guide.part_01.chapter_14_Generics._11_GenericInterface;

/**
 * Created by mega on 06.09.2016.
 */
public class Limit_Error {

}


// ОГРАНИЧЕНИЯ!!!
//class MyClass2<T extends Comparable<T>> implements MinMax<T extends Comparable<T>> {} // ОШИБКА
class MyClass2<T extends Comparable<T>> implements MinMax<T> { // достаточно MinMax<T>
    @Override
    public T min() {
        return null;
    }

    @Override
    public T max() {
        return null;
    }
}

//class MyClass3 implements MinMax<T> { // ОШИБКА - не обобщенный класс не может имплементить обобщенный интерфейс<T> T - неизвестно
class MyClass3 implements MinMax<Integer> { // а так работает, тк в интерфейс передается конкретный тип - Integer
    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    } // ОШИБКА - не обобщенный класс не может имплементить обобщенный интерфейс<T> T - неизвестно

}

