package leet75;

import java.util.ArrayDeque;
import java.util.Deque;

public class T75Leet933NumberOfRecentCalls {
    Deque<Integer> deque;

    public T75Leet933NumberOfRecentCalls() {
        deque = new ArrayDeque<>();
    }

    public int ping(int t) {
        deque.add(t);

        while (!deque.isEmpty() && deque.peek() < t - 3000) {
            deque.poll();
        }

        return deque.size();
    }
}
