package collection;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue(Collections.reverseOrder());
        pq.offer(3);
        pq.offer(1);
        System.out.println(pq.peek());
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq.peek());
        System.out.println(pq);

        Object obj = null;

        while ((obj = pq.poll()) != null) System.out.println(obj);




    }
}
