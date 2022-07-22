package warsztat1_genericMethod.queue;

import java.util.List;
import java.util.Queue;

public class PriorityQueue {

    public static void main(String[] args) {

        List<Integer> input = List.of(1, 5, 9, 1, 5, 28, 1, 62, 2);

        Queue<Integer> priority = new java.util.PriorityQueue<>();
        for (int i : input){
            priority.offer(i);
            System.out.println(priority);
        }

        int size = priority.size();

        for (int i = 0 ; i < size; i++){
            System.out.println("priority.peek: " + priority.peek());
            System.out.println(priority);
            System.out.println("priority.poll:" + priority.poll());
            System.out.println(priority);
        }

    }
}
