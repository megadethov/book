package full_guide.part_01.chapter_12._08_AnotationExample;

/**
 * Created by mega on 30.08.2016.
 */
// Все аннотации неявно расширяют интерфейс (java.lang.annotation.Annotation) и переопределяют методы Object:
    // hashCode, equals, toString + объявляет свой annotationType() -> return Class
@interface MyAnnotation {
    String str();
    int val();
}
