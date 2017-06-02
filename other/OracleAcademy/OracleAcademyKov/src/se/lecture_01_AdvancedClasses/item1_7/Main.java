package se.lecture_01_AdvancedClasses.item1_7;

/**
 * Created by Yefremov Yuriy
 */
public class Main {
    public static void main(String[] args) {

        // вызываем метод doSome и в параметрах создаем анонимный класс
        doSome(new SomeInt() {
            @Override
            public int f(int x) {
                return x * x;
            }
        });
        // альтернатива анонимного класса показанного выше - лямбда выражение
        // создаем ф-цию, к-ая имеет тип интерфеса
        SomeInt func = k -> k * k; // (параметр ф-ции) -> (что делать)
        // а теперь вызывая метод doSome(), но пердается ф-ция
        doSome(func);
        // можно сделать это и анонимно в одну строку
        doSome(k -> k * k); // по сути здесь компилятор знает, что параметр - интерфейс и нужно реализовать его метод
                            // с параметром 3. И лямбда выражение в скобках примет как реализацию с параметром 3.

    }

    // этот метод принимает объект
    public static void doSome(SomeInt someInt) { // с типом интерфейса SomeInt
        System.out.println(someInt.f(3)); // и вызывет его метод
    }
}

// чтобы лямбда работали у интерфейса должен быть только ОДИН метод
interface SomeInt {
    int f(int x);
}
