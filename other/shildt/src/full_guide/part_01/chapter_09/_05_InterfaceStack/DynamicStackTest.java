package full_guide.part_01.chapter_09._05_InterfaceStack;

/**
 * Created by mega on 26.08.2016.
 */
public class DynamicStackTest {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack(5);
        IStack stack2 = new DynamicStack(8);


        // Разместить числа в стеке
        for (int i = 0; i < 10; i++) stack.push(i);
        for (int i = 0; i < 8; i++) stack2.push(i);

        // Извлечь эти числа из стека
        System.out.println("Данные в stack: ");
        for (int i = 0; i < stack.getStack().length; i++) System.out.print(" " + stack.pop());
        System.out.println();

        System.out.println("Данные в stack2: ");
        for (int i = 0; i < 8; i++) System.out.print(" " + stack2.pop());

        stack.clean(); // здесь используется дефолтная реализация в интерфейсе
    }
}
