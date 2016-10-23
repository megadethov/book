package full_guide.part_01.chapter_12._10_Reflection_getAnnotation_Method_withoutArg;

/**
 * Created by mega on 30.08.2016.
 */
// С помощью рефлексии вытаить мета инфо из аннотации метода
public class Test {
    public static void main(String[] args) {
        Meta m = new Meta();
        m.reflectMethod();
    }
}
