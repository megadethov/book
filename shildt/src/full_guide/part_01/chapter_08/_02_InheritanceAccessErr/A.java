package full_guide.part_01.chapter_08._02_InheritanceAccessErr;

/**
 * Created by mega on 25.08.2016.
 */
// В иерархии классов закрытые члены остаются закрытыми в пределах своего класса
public class A {
    int i;
    private int j;
    void showIJ() {
        System.out.println("val and j: " + i + " " + j );
    }
}
