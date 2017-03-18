package full_guide.part_01.chapter_07._11_Access;

/**
 * Created by mega on 25.08.2016.
 */
// В этой программе демонстрируется отличие модификаторов private и public
public class Access {
    int a;
    public int b;
    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
