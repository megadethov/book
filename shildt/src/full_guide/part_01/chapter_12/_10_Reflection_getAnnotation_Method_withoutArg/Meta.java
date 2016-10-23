package full_guide.part_01.chapter_12._10_Reflection_getAnnotation_Method_withoutArg;

import java.lang.reflect.Method;

/**
 * Created by mega on 30.08.2016.
 */
public class Meta {
    // аннотировать метод
    @MyAnnotation(str = "Test annotation", val = 100)
    public void reflectMethod() {
        Meta meta = new Meta();

        // получить аннотацию из метода
        // и вывести значения ее членов
        try {
            // сначала получить объект типа Class,
            // представляющий данный класс
            Class clazz = meta.getClass();

            // Затем получить объект типа Method,
            // представляющий данный метод
            Method m = clazz.getMethod("reflectMethod");

            // далее получить аннотацию для данного метода
            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);

            //  и наконец вывести значения членов аннотации
            System.out.println(annotation.str() + " " + annotation.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found.");
        }
    }
}
