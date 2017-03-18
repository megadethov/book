package full_guide.part_01.chapter_12._13_AnnotationWithDefault;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by mega on 30.08.2016.
 */
public class Meta {
    @AnnotationWithDefault
  public  void metaMethod(Meta meta) { // ВНИМАНИЕ! если срезать public - NoSuchMethodException

        try {
            Class clazz = meta.getClass();
            Method m = clazz.getMethod("metaMethod", Meta.class);
            AnnotationWithDefault annotation = m.getAnnotation(AnnotationWithDefault.class);
            System.out.println(annotation.str() + " " + annotation.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }

    }
}
