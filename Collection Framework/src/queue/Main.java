package queue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList queue = new LinkedList();

        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.remove());
        System.out.println(queue);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(11);
        pq.offer(40);
        pq.offer(50);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }

}
