package full_guide.part_01.chapter_08._06_Super;

/**
 * Created by mega on 25.08.2016.
 */
// super предотвращает сокрытие имен
public class B extends A {
    int i;

    public B(int a, int b) {
        super.i = a;
        this.i = b;
    }
    void show() {
        System.out.println("super val = " + super.i);
        System.out.println("sub val = " + this.i);
    }
}
