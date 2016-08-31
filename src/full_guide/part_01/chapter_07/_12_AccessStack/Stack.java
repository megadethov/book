package full_guide.part_01.chapter_07._12_AccessStack;

/**
 * Created by mega on 24.08.2016.
 */
// В этом классе определяется целочисленный стек в к-ом можно хранить до 10 значений
public class Stack {

    // Теперь поля закрыты и никто случайно их не изменит
    private int[] stack = new int[10];
    private int pointer;

    public Stack() {
        this.pointer = -1;
    }

    void push(int item) {
        if (pointer == 9){
            System.out.println("Стек заполнен");
        } else {
            stack[++pointer] = item;
            System.out.println(item + " добавлен в стек");
        }
    }
    int pop() {
        if (pointer < 0) {
            System.out.println("Стек пустой");
            return 0;
        } else {
            System.out.println(stack[pointer] + " удалено из стека");
            return stack[pointer--];

        }
    }
}
