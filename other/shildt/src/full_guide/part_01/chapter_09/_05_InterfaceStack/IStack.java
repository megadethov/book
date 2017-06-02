package full_guide.part_01.chapter_09._05_InterfaceStack;

/**
 * Created by mega on 26.08.2016.
 */
public interface IStack {
    void push(int item); // сохранить элемент в стеке

    int pop(); // извлечь элемент из стека

    default void clean() {
        throw new UnsupportedOperationException(); // реализация не обязательна
    }
}
