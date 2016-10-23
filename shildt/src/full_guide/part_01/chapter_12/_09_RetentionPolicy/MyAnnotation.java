package full_guide.part_01.chapter_12._09_RetentionPolicy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by mega on 30.08.2016.
 */
// enum RetentionPolicy - определяет время жизни аннотаций
// SOURCE - аннотации вмдны только в исходниках, после компиляции не видны
// CLASS (default) - остаются в .class файлах, но в runtime JVM их не видит
// RUNTIME - видны в runtime
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String str();

    int val();
}
