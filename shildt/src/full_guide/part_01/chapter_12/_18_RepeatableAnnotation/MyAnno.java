package full_guide.part_01.chapter_12._18_RepeatableAnnotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by mega on 31.08.2016.
 */
// сделать аннотацию MyAnnotation повторяющейся

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnotations.class)
@interface MyAnnotation {
    String str() default "Test";
    int val() default 9000;
}

// Это контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnotations {
    MyAnnotation[] value(); // имя value() - обязательно
}

class MyClass {
    //  повторить аннотацию MyAnnotation в методе MyMethod
    @MyAnnotation(str = "First Annotation", val = -1)
    @MyAnnotation(str = "Second Annotation", val = -100)
    public static void myMethod(String str, int i) {
        MyClass myClass = new MyClass();
        Class clazz = myClass.getClass();
        try {
            Method m = clazz.getMethod("myMethod", String.class, int.class);
            // вывести повторяющиеся аннотации MyAnnotation
            Annotation anno = m.getAnnotation(MyRepeatedAnnotations.class);
            System.out.println(anno);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        myMethod("test", 10);
    }
}

