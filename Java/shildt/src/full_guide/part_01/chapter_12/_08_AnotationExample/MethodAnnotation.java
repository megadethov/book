package full_guide.part_01.chapter_12._08_AnotationExample;

/**
 * Created by mega on 30.08.2016.
 */
public class MethodAnnotation {
//    @MyAnnotation() // не работает требует параметры
    @MyAnnotation(str = "Test annotation", val = 1000)
    void f() {
        System.out.println("method with annotation");
    }
}
