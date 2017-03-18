package full_guide.part_01.chapter_07._15_Final;

/**
 * Created by mega on 25.08.2016.
 */
public class FinalTest {
    final int FILE_NEW = 0;
    final int FILE_OPEN = 1;
    final int FILE_SAVE = 2;
    final int FILE_CLOSE = 3;
}

class Test {
    FinalTest finalTest = new FinalTest();
//    finalTest.FILE_NEW = 10; // нельзя изменить финальное поле
}
