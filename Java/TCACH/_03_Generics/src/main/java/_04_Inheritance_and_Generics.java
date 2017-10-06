import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class _04_Inheritance_and_Generics {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        List<String> strList2 = new LinkedList<>();
        List<Object> objList = new ArrayList<>();

        print(strList); // ок
        print(strList2); // ок
//        print(objList); // compile error, требуется - Collection<String>

    }

    public static void print(Collection<String> list) {
        for (String next : list) {
            System.out.println(next);
        }
    }
}
