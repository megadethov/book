package full_guide.part_01.chapter_12._11_Reflection_getAnnotation_Method_withArg;

import java.lang.reflect.Method;

/**
 * Created by mega on 30.08.2016.
 */
public class Meta {
    @MyAnnotation(str = "Annotation method with arg", val = 100)
    public void metaMethod(Meta meta, String s, int i) {
        // вытащить ссылку типа Class объекта Meta
        Class clazz = meta.getClass();
        try {
            // в ссылку типа Method вытащить метод metaMethod класса Meta
            Method m = clazz.getMethod("metaMethod", Meta.class, String.class, int.class);
            // для метода metaMethod вытащить аннотацию в переменную annotation
            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);
            // вывести мета инфо аннотации MyAnnotation
            System.out.println(annotation.str() + " " + annotation.val());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}


