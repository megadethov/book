package full_guide.part_01.chapter_09._05_InterfaceStack;

/**
 * Created by mega on 26.08.2016.
 */
// Реализация интерфейса IStack для стека динамического размера
public class DynamicStack implements IStack {
    private int[] stack;
    private int pointer;

    public DynamicStack(int size) {
        stack = new int[size];
        pointer = -1;
    }

    public int[] getStack() {
        return stack;
    }

    public int getPointer() {
        return pointer;
    }

    // Разместить элемент в стеке (при заполнении удваивается)
    @Override
    public void push(int item) {
        if (pointer == stack.length - 1){
            int[] tmp = new int[stack.length * 2];
            for(int i = 0; i < stack.length; i++) tmp[i] = stack[i];
            stack = tmp;
            stack[++pointer] = item;
        }
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
