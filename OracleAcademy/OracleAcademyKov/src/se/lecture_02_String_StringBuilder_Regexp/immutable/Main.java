package se.lecture_02_String_StringBuilder_Regexp.immutable;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Yefremov Yuriy
 */
public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(); // создали календарь, чтобы взять у него дату
        ImmutableClass immutableClass = new ImmutableClass(100, "hello", calendar.getTime()); // создали инстанс класса

        System.out.println("before change " + immutableClass); // смотрим поля объекта

        Date mutableField = immutableClass.setMutableField(10000001); // насетили поле

        System.out.println("change " + mutableField); // смотрим значение насеченного поля

        System.out.println("after change " + immutableClass); // смотрим поля объекта после

        /* String str = "hello";
        String substring = str.substring(3); // не меняет саму строку
        str = substring;
        System.out.println(substring);
        System.out.println(str);*/

//        String str = "hi" + "hello"; // здесь в String Pool будет создано 3 объекта
    }
}

// Пример немутирующего объекта (поля приват, сеттеров нет)
final class ImmutableClass {
    // финальные поля должны быть инициализированы (в конструкторе)
    private final Integer immutableField1; // immutable по умолчанию
    private final String immutableField2; // immutable по умолчанию
    private final Date mutableField; // mutableField

    public ImmutableClass(Integer fld1, String fld2, Date date) {
        immutableField1 = fld1;
        immutableField2 = fld2;
        mutableField = new Date(date.getTime());
    }

    // это Фабричный метод.
    // Статический, возвращает инстанс самого себя
    public static ImmutableClass createNewInstance(Integer fld1, String fld2, Date date) { // можно также создавать инстансы ч/з фабричный метод
        return new ImmutableClass(fld1, fld2, date);
    }

    /*не нужно предоставлять setter методы*/

    public Integer getImmutableField1() { // геттер
        return immutableField1;
    }


    public String getImmutableField2() { // геттер
        return immutableField2;
    }

    public Date setMutableField(long l) { // сеттер для мктирующего поля

        return new Date(mutableField.getTime()); // нужно вернуть ссылку на новый объект, но с теми же характеристиками
    }

    @Override
    public String toString() {
        return immutableField1 + " - " + immutableField2 + " - " + mutableField;
    }

}
