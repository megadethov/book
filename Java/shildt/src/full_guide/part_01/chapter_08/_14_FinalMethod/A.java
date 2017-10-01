package full_guide.part_01.chapter_08._14_FinalMethod;

/**
 * Created by mega on 26.08.2016.
 */
// Нельзя переопределить final метод
public class A {
    final void methodA() {}
}
class B extends A {
//    void methodA() {} // method is final
}
// Ведет к оптимизации - раннему связыванию в момент комипляции
