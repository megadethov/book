package full_guide.part_01.chapter_12._12_GetAllAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by mega on 30.08.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface OneAnnotation {
    String str();
    int val();
}
