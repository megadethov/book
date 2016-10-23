package full_guide.part_01.chapter_09._10_MultipleInheritance;

/**
 * Created by mega on 27.08.2016.
 */
public class ClassA implements Alpha, Beta {
    @Override
    public void reset() {
        System.out.println("ClassA");
    }
}
