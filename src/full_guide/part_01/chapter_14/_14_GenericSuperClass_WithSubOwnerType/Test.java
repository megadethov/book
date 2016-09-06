package full_guide.part_01.chapter_14._14_GenericSuperClass_WithSubOwnerType;

/**
 * Created by mega on 06.09.2016.
 */
public class Test {
    public static void main(String[] args) {

        Gen2<String, Integer> gen2 = new Gen2<>("The value is: ", 10);

        System.out.println(gen2.getObjT());
        System.out.println(gen2.getObjV());
    }
}
