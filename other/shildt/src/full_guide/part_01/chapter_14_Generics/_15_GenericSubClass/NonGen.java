package full_guide.part_01.chapter_14_Generics._15_GenericSubClass;

/**
 * Created by mega on 06.09.2016.
 */
//Класс NonGen является необобщенным, поэтому никаких аргументов типа
//        в нем не указывается. И даже если в классе Gen объявляется параметр типа Т, то
//        он не требуется (и не может бьпъ использован) в классе NonGen. Таким образом,
//        класс Gen наследуется от класса NonGen обычным образом. Никаких специальных
//        условий для этого не требуется.

// Не обобщенный класс может быть суперклассом для обобщенного
public class NonGen {
    int num;

    public NonGen(int num) {

        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

// Обобщенный подкласс
class Gen<T> extends NonGen {
    T obj;

    public Gen(int num, T obj) {
        super(num);
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
class Test {
    public static void main(String[] args) {
        Gen<String> gen = new Gen<>(100, "Value = ");

        System.out.print(gen.getObj());
        System.out.println(gen.getNum());
    }
}

