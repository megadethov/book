package full_guide.part_01.chapter_14_Generics._02_BeforGenerics;

/**
 * Created by mega on 03.09.2016.
 */
// Без generics  не обеспечивается проверка типов компилятором
public class Test {
    public static void main(String[] args) {
        BoxWithoutGenerics box = new BoxWithoutGenerics("Hello");
        BoxWithoutGenerics box2 = new BoxWithoutGenerics(100);

        box.print();
        box2.print();

        box = box2; // компилятор пропускает, а в runtime ошибка
    }
}

class BoxWithoutGenerics {
    Object obj;

    public BoxWithoutGenerics(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }
    public void print() {
        System.out.println(obj);
        System.out.println(obj.getClass().getName());
    }

}
