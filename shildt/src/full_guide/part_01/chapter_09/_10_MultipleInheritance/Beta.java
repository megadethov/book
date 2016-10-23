package full_guide.part_01.chapter_09._10_MultipleInheritance;

/**
 * Created by mega on 27.08.2016.
 */
public interface Beta extends Alpha {
    default void reset() {
        System.out.println("Beta");
//        Alpha.super.reset(); // вызов метода для  super интерфейса
    }
}
