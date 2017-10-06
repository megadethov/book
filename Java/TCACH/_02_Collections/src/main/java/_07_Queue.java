import java.util.LinkedList;
import java.util.Queue;

public class _07_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <=5; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue);
            queue.poll();
        }
    }
}

/*
        [1, 2, 3, 4, 5]
        [2, 3, 4, 5]
        [3, 4, 5]
        [4, 5]
        [5]
*/
