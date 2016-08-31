package full_guide.part_01.chapter_07._08_ReturnObject;

/**
 * Created by mega on 24.08.2016.
 */
// Возврат объекта
public class Box {
    int a;

    public Box(int a) {
        this.a = a;
    }

    Box returnObj () {
        Box temp = new Box(this.a + 10);
        return temp;
    }

}
