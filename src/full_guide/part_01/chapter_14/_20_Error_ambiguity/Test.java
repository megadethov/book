package full_guide.part_01.chapter_14._20_Error_ambiguity;

/**
 * Created by mega on 06.09.2016.
 */
// Неоднозначность возникает при overloading в результате стирания типов перегружаемых методов
public class Test<T, V> {
    T ob;
    V ob2;

    public void set(T ob) {
        this.ob = ob;
    }

//    public void set(V ob2) {
//        this.ob2 = ob2;
//    }
}
