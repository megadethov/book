package full_guide.part_01.chapter_10._07_ThrowsError;

/**
 * Created by mega on 27.08.2016.
 */
public class ThrowsErrorFix {
    public static void main(String[] args) {
      try {
          f();
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
    }

     static void f() throws Exception {
          throw new Exception("ThrowsErr"); // Unhandled exception
    }
}
