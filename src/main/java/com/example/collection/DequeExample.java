package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Element1");
        deque.addFirst("Element2");
        deque.addFirst("Element3");
        // 가장 먼저 나가는 쪽에다 요소 추가
        deque.addLast("Element4");

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());



    }
}
