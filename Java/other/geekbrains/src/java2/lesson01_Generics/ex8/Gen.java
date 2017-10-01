package java2.lesson01_Generics.ex8;

/**
 * Created by mega on 05.09.2016.
 */
public class Gen<K, V> {
    K obj; // K становится, например Integer только на момент компиляции, в runtime это будет - Object (тип стирается)
    V obj2;
    private K[] objects;

    static int i = 42; // так можно и доступно для чтения без создания инстанса
    // 1 ОГРАНИЧЕНИЕ - нельзя объявить static обобщенному типу
//    static K ref; // так нельзя, потому что, обращение к static переменным возможно без инстанса, а generics отрабатывают
// только в рантайм при создании объекта

    // 2 ОГРАНИЧЕНИЕ - нельзя перегружать обобщенные методы (могут принимать одинаковые значения и в рантайм из-за
    // стирания все аргументы станут Object) - РЕШЕНИЕ использовать разные названия методов
    // both methods have same erasure
//    void set(K val) {
//        obj = val;
//    }
//    void set(V val2) {
//        obj2 = val2;
//    }

    // 3 ОГРАНИЧЕНИЕ - нельзя создать инстансы (стирание)
    void createdNewObject() {
//        obj = new K(); // равнозначно new Object(), оригинальный конструктор типа K - теряется (стирание)
//        obj2 = new V(); // равнозначно new Object(), оригинальный конструктор типа K - теряется (стирание)
    }

    // 4 ОГРАНИЧЕНИЕ - аналогично нельзя инстанциировать массивы, получится массив Object
   void createNewArrObject() {
//       objects = new K[100];
//       objects = new Object[100];
   }
}

// 5 ОГРАНИЧЕНИЕ - generic class не могут наследоваться от Throwable
class MyException extends Exception {} // работает
//class MyException2<T> extends Exception {} // не работает
