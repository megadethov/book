package full_guide.part_01.chapter_09._09_MultipleInheritance;

/**
 * Created by mega on 27.08.2016.
 */
public interface Alpha {
    default void reset() {
        System.out.println("Alpha default reset()");
    }
}
