package full_guide.part_01.chapter_09._05_InterfaceStack;

/**
 * Created by mega on 26.08.2016.
 */
public class FixedStackTest {
    public static void main(String[] args) {
        FixedStack stack = new FixedStack(5);
        IStack stack2 = new FixedStack(8);

        // Разместить числа в стеке
        for (int i = 0; i < 5; i++) stack.push(i);
        for (int i = 0; i < 8; i++) stack2.push(i);

        // Извлечь эти числа из стека
        System.out.println("Данные в stack: ");
        for (int i = 0; i < 5; i++) System.out.print(" " + stack.pop());
        System.out.println();

        System.out.println("Данные в stack2: ");
        for (int i = 0; i < 8; i++) System.out.print(" " + stack2.pop());

    }
}
