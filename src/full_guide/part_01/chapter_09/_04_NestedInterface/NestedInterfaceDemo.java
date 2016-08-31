package full_guide.part_01.chapter_09._04_NestedInterface;

/**
 * Created by mega on 26.08.2016.
 */
// Пример вложенного интерфейса
public class NestedInterfaceDemo {
    public static void main(String[] args) {
        A.NestedIF ref = new B();

        System.out.println(ref.isNegative(10));
        System.out.println(ref.isNegative(-5));
    }
}

// Этот класс содержит интерфейс как свой член
class A {
    // это вложенный интерфейс В ОТЛИЧИЕ ОТ ОБЫЧНОГО МОЖЕТ ИМЕТЬ ДОПОЛНИТЕЛЬНО - private, protected access
    public interface NestedIF {
        boolean isNegative(int x);
    }
}

class B implements A.NestedIF {

    @Override
    public boolean isNegative(int x) {
        return x < 0 ? true : false;
    }
}


