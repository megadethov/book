package full_guide.part_01.chapter_12._17_TypeAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by mega on 31.08.2016.
 */
//В версии JDK 8 расширены места, в которых могут применяться аннотации .
//        Раньше аннотации допускались только в объявлениях, как бьшо показано в предыдущих
//        примерах. Но с выпуском версии JDK 8 появилась возможность указывать
//        аннотации везде, где применяются типы данных. Такая расширенная возможность
//        применения аннотаций называется типовой аннотацией.
//    В типовую компиляцию должна быть включена целевая константа
//            ElementType. ТУРЕ_USE. ( Как пояснялось ранее, достоверные целевые константы
//            аннотаций указываются с помощью аннотации @ Target.)

//    Таблица 12.2. Имена и целевые константы аннотаций
//    ------------------------------------------------------
//  Аннотация         Целевая константа
//    --------------------------------------------------------
// @TypeAnno          ElementType.TYPE_USE
// @MaxLen            ElementType.TYPE_USE
// @NotZeroLen        ElementType.TYPE_USE
// @Unique            ElementType.TYPE_USE
// @What              ElementType.PARAMETER
// @EmptyOK           ElementType.FIELD
// @Recommended       ElementType.METHOD

// Продемонстрировать применение нескольких типовых аннотаций
// Аннотация маркер, к-ую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface TypeAnno {
}

// Еще одна аннотация маркер, к-ую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}

// И еще одна аннотация маркер, к-ую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface Unique {
}

// Параметризированная аннотация, к-ую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

// Аннотация к-ую можно применить к параметру типа
@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}

// Аннотация к-ую можно применить в объявлении поля
@Target(ElementType.FIELD)
@interface EmptyOk {
}

// Аннотация к-ую можно применить в объявлении метода
@Target(ElementType.METHOD)
@interface Recommended {
}

// применить аннотацию в параметре типа
class TypeAnnoDemo<@What(description = "Данные обобщенного типа") T> {

    // применить типовую аннотацию в конструкторе
    public @Unique TypeAnnoDemo() {
    }

    // аннотировать тип (в данном случае - String), но не поле
    @TypeAnno String str;

    // аннотировать текст поля
    @EmptyOk
    String test;

    // применить типовую аннотацию для аннотирования
    // ссылки this на объект (получатель)
    public int f(@TypeAnno TypeAnnoDemo<T>this, int x) {
        return 10;
    }

    // ннотировать возвращаемый тип, тк целевая константа аннотации - ElementType.ТУРЕ_USE
    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    // аннотировать объявление метода, тк целевая константа аннотации - ElementType.METHOD
    public
    @Recommended
    Integer f3(String str) {
        return str.length() / 2;
    }

    // применить типовую аннотацию в операторе throws
    public void f4() throws @TypeAnno NullPointerException {
    }

    // аннотировать уровни доступа кмассиву
    String @MaxLen(10) [] @NotZeroLen [] w;

    // аннотировать тип элемента массива
    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {
        // применить типовую аннотацию в аргументе типа
        TypeAnnoDemo<@TypeAnno Integer> оЬ =
                new TypeAnnoDemo<@TypeAnno Integer>();
        // применить типовую аннотацию в операторе new
        @Unique TypeAnnoDemo<Integer> оЬ2 =
                new @Unique TypeAnnoDemo<Integer>();
        Object х = new Integer(10);
        Integer у;
        // применить типовую аннотацию в приведении типов
        у = (@TypeAnno Integer) х;
    }

    public static void main(String args[]) {
        myMeth(10);
// применить типовую аннотацию в выражении наследования
        class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {
        }
    }

}


public class Demo {
}


