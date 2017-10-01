package full_guide.part_01.chapter_07._11_Access;

/**
 * Created by mega on 25.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        Access access = new Access();
        access.a = 1;
        access.b = 2;
//        access.c = 3; // private access
        access.setC(3);

        System.out.println(access.a + " " + access.b + " " + access.getC());

    }
}
