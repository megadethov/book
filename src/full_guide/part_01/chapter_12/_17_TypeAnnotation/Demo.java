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
@interface Unique {}

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
@interface EmptyOk {}

// Аннотация к-ую можно применить в объявлении метода
@Target(ElementType.METHOD)
@interface Recommended {}





public class Demo {
}


