package full_guide.part_01.chapter_07._07_PassObjRef;

/**
 * Created by mega on 24.08.2016.
 */
// Объекты передаются по ссылке на них
public class PassObjRef {
    int a;
    int b;

    public PassObjRef(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void doubleValue(PassObjRef ref) {
        ref.a *= 2;
        ref.b *= 2;
    }
}
