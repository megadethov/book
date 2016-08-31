package full_guide.part_01.chapter_10._09_MyException;

/**
 * Created by mega on 27.08.2016.
 */
public class MyException extends Exception {
    @Override
    public String toString() {
        String str = "This is my exception test. \nThis is checked exception.";
        return str;
    }
}

class Test {
    public static void main(String[] args) {
        try{
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
