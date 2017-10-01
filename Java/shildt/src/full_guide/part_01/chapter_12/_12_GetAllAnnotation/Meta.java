package full_guide.part_01.chapter_12._12_GetAllAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by mega on 30.08.2016.
 */
// Показать все аннотации для класса и метода
@OneAnnotation(str = "One class annotation", val = 100)
@TwoAnnotation(str = "Two class annotation", val = 200)
public class Meta {

    @OneAnnotation(str = "One method annotation", val = 10)
    @TwoAnnotation(str = "Two method annotation", val = 20)
    public void metaMethod() {
        Meta meta = new Meta();
        // для класса
        Annotation[] annotations = meta.getClass().getAnnotations();
        System.out.println("All annotation of class Meta:");
        for (Annotation a : annotations) {
            System.out.println(a);
        }

        // для метода
        try {
            Method method = meta.getClass().getMethod("metaMethod");
            annotations = method.getAnnotations();
            System.out.println("All annotation of method metaMethod():");
            for (Annotation a : annotations) {
                System.out.println(a);
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // getDeclaredAnnotation
        // Данный метод возвращает ненаследуемые аннотации, присутствующие в вызывающем объекте.
        annotations = meta.getClass().getDeclaredAnnotations();
        System.out.println("getDeclaredAnnotation: ");
        for (Annotation a : annotations) {
            System.out.println(a);
        }

        // isAnnotationPresent
//        Этот метод возвращает логическое значение true , если аннотация, заданная
//        в виде аргумента тип_ аннотации, связана с вызывающим объектом . В противном
//        случае возвращается логическое значение false . В версии JDK 8 эти методы
//        дополнены методами getDeclaredAnnotation(), getAnnotationsByType()
//        и getDeclaredAnnotationsByType().
        System.out.println(meta.getClass().isAnnotationPresent(OneAnnotation.class)); // true
        System.out.println(meta.getClass().isAnnotationPresent(Override.class)); // false
    }
}
