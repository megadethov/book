package full_guide.part_01.chapter_18_Collections._24_StackDemo;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by mega on 10.09.2016.
 */
// Продемонстрировать применение класса Stack
public class StackDemo {
    static void pushPrint(Stack<Integer> s, int val) {
        System.out.println("push ->" + s.push(val)); // push возвращает вставляемый элемент
        System.out.println("Stack: " + s);

    }
    static void popPrint(Stack<Integer> s) throws EmptyStackException { // unchecked RuntimeException
        System.out.println("pop ->" + s.pop()); // pop возвращает удаляемый элемент
        System.out.println("Stack: " + s);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        System.out.println("Stack: " + stack);

        pushPrint(stack, 10);
        pushPrint(stack, 20);
        pushPrint(stack, 30);
        popPrint(stack);
        popPrint(stack);
        popPrint(stack);

        try {
            popPrint(stack);
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty");
        }
    }
}
