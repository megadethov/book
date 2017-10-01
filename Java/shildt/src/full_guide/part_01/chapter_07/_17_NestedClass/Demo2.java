package full_guide.part_01.chapter_07._17_NestedClass;

/**
 * Created by mega on 25.08.2016.
 */
// inner не доступен для outer (только ч/з экземпляр)
public class Demo2 {
    public static void main(String[] args) {

    }
}

class Outer2 {
    void f() {
//        System.out.println(x); // not compile
    }

    class Inner2 {
        int x = 10;
    }
}
