package full_guide.part_01.chapter_12._13_AnnotationWithDefault;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by mega on 30.08.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationWithDefault {
    String str() default "Test default";
    int val() default 100;
}
