package full_guide.part_01.chapter_12._11_Reflection_getAnnotation_Method_withArg;

/**
 * Created by mega on 30.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        Meta meta = new Meta();
        meta.metaMethod(meta, "test", 100);
    }
}
