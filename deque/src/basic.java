import java.util.ArrayDeque;
import java.util.Deque;

public class basic {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addFirst(15);
        deque.addFirst(20);
        System.out.println(deque);

        deque.addLast(-10);
        deque.addLast(-15);
        deque.addLast(-20);
        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println(deque.pollLast());
        System.out.println(deque);

    }
}
