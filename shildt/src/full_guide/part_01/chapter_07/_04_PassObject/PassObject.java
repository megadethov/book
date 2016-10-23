package full_guide.part_01.chapter_07._04_PassObject;

/**
 * Created by mega on 24.08.2016.
 */
// объекты в качестве параметров метода
public class PassObject {
    int a;
    int b;

    public PassObject(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equals(PassObject obj) {
        if (this.a == obj.a && this.b == obj.b) return true;
        else return false;
    }
}
