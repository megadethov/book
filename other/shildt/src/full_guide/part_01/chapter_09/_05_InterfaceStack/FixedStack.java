package full_guide.part_01.chapter_09._05_InterfaceStack;

/**
 * Created by mega on 26.08.2016.
 */
// Реализация интерфейса IStack для стека фиксированного размера
public class FixedStack implements IStack {
    private int[] stack;
    private int pointer;

    public FixedStack(int size) {
        stack = new int[size];
        pointer = -1;
    }
// Разместить элемент в стеке
    @Override
    public void push(int item) {
        if (pointer == stack.length - 1) System.out.println("Стек заполнен");
        else stack[++pointer] = item;
    }
// Извлечь элемент из стека
    @Override
    public int pop() {
        if (pointer < 0) {
            System.out.println("Стек не заполнен");
            return 0;
        } else {
            return stack[pointer--];
        }
    }
}
