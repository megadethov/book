package full_guide.part_01.chapter_14._19_bridgeMethod;

/**
 * Created by mega on 06.09.2016.
 */
// Ситуация в которой создается мостовой метод
public class Gen<T> {
    T ob; // объявить объект типа T

    // передатьконструктору ссылку на объект типа T
    public Gen(T ob) {
        this.ob = ob;
    }

    // возвратить объект ob
    T getOb() {
        return ob;
    }
}

// Подкласс производный от класса Т
class Gen2 extends Gen<String> {
    public Gen2(String ob) {
        super(ob);
    }
    // перегрузить(overloading) метод getOb() для получения символьных строк
    String getOb() {
        System.out.println("Calling method String getOb(): ");
        return ob;
    }
}

// родемонстрировать ситуацию, когда требуется мостовой метод
class BridgeDemo {
    public static void main(String[] args) {

        // оздать объект типа Gen2 для символьных строк
        Gen2 strOb2 = new Gen2("Bridge test");
        System.out.println(strOb2.getOb());
    }
}

