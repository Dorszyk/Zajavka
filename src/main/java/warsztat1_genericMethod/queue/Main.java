package warsztat1_genericMethod.queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {


        List<Integer> input = List.of(1, 5, 9, 1, 5, 28, 1, 62, 2);

        Queue<Integer> queue = new ArrayDeque<>();
        for (Integer element : input) {
            queue.offer(element);
        }

        System.out.println(queue);


        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.println("queue.peek: " + queue.peek());
            System.out.println(queue);
            System.out.println("queue.poll:" + queue.poll());
            System.out.println(queue);

        }

    }
}
