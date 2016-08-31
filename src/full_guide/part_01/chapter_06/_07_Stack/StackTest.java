package full_guide.part_01.chapter_06._07_Stack;

/**
 * Created by mega on 24.08.2016.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 10; i++) {
            stack.pop();
        }

        stack.pop();
    }
}
