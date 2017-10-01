package full_guide.part_01.chapter_13._15_thisConstructor;

/**
 * Created by mega on 02.09.2016.
 */
// Конструктор this - предотвращает дублирование кода.
public class Demo {
    public Demo(int a, int b) {

    }
    public Demo(int a) {
        this(a, a);
    }
    public Demo() {
        this(10);
    }
}
