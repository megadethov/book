package java2.lesson01_Generics.ex4;

/**
 * Created by mega on 05.09.2016.
 */
public class Main2 {
    public static void main(String[] args) {
        Gen2<Cat> obj = new Gen2<>(new Cat());
        obj.show();
    }
}
