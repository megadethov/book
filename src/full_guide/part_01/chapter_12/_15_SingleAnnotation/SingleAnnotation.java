package full_guide.part_01.chapter_12._15_SingleAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by mega on 31.08.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SingleAnnotation {
    int value(); // value - обязательное имя для одночленной аннотации
}
