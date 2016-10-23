package full_guide.part_01.chapter_14_Generics._16_instanceof_GenHierarchy;

/**
 * Created by mega on 06.09.2016.
 */
// Использовать оператор instanceof в иеоаохии обобщеных классов
public class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
// Подкласс производный от класса Gen
class Gen2<T> extends Gen<T> {
    public Gen2(T obj) {
        super(obj);
    }
}
// продемонс трировать последствия динамической идентификации типов в иерархии обобщенных классов
class Demo {
    public static void main(String[] args) {

        // создать объект типа Gen для целых чисел
        Gen<Integer> iOb = new Gen<>(100);
        // создать объект типа Gen для целых чисел
        Gen2<Integer> iOb2 = new Gen2<>(200);
        // создать объект типа Gen2 для строк
        Gen2<String> strOb2 = new Gen2<>("Hello");

        // проверить является ли объект iOb2 какой-нибудь из форм класса Gen2
        if (iOb2 instanceof Gen2<?>) System.out.println("iOb2 is a Gen2");
        else System.out.println("iOb2 is not a Gen2");

        // проверить является ли объект iOb2 какой-нибудь из форм класса Gen
        if (iOb2 instanceof Gen<?>) System.out.println("iOb2 is a Gen");
        else System.out.println("iOb2 is not a Gen");

        // проверить является ли объект strOb2 какой-нибудь из форм класса Gen2
        if (strOb2 instanceof Gen2<?>) System.out.println("strOb2 is a Gen2");
        else System.out.println("strOb2 is not a Gen2");

        // проверить является ли объект strOb2 какой-нибудь из форм класса Gen
        if (strOb2 instanceof Gen<?>) System.out.println("strOb2 is a Gen");
        else System.out.println("strOb2 is not a Gen");

        // проверить является ли объект iOb какой-нибудь из форм класса Gen2
        if (iOb instanceof Gen2<?>) System.out.println("iOb is a Gen2");
        else System.out.println("iOb is not a Gen2");

        // проверить является ли объект iOb какой-нибудь из форм класса Gen
        if (iOb instanceof Gen<?>) System.out.println("iOb is a Gen");
        else System.out.println("iOb is not a Gen");

        // а этот код не скомпилируется. instanceof не работает для конкретных типов (стирание)
//        if (iOb instanceof Gen<Integer>) System.out.println(); // Illegal generic type for instanceof

    }
}
