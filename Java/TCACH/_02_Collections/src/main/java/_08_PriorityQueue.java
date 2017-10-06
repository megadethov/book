import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _08_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 1; i <=5; i++) {
            queue.add(i);
        }
        // Приоритет задается сортировкой (Comparator/Comparable), для интов - естественная
        // Для изменения приоритета - свой Comparator
        while (!queue.isEmpty()) {
            System.out.println(queue);
            queue.poll();
        }
    }
}

/*
        [1, 2, 3, 4, 5]
        [2, 4, 3, 5]
        [3, 4, 5]
        [4, 5]
        [5]
*/
