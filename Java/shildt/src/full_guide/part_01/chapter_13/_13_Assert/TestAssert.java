package full_guide.part_01.chapter_13._13_Assert;

/**
 * Created by mega on 02.09.2016.
 */
// для включения механизма assert нужен флаг для VM -ea
public class TestAssert {
    public static void main(String[] args) {
        int x = 10;
//        assert x == 100;
        assert x == 100 : "wrong!";
    }

}


