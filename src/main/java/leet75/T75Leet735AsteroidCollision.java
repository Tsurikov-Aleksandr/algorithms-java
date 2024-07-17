package leet75;

import java.util.ArrayDeque;
import java.util.Deque;

public class T75Leet735AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int x : asteroids) {
            if (x > 0) {
                deque.addLast(x);
                continue;
            }

            boolean deadAst = false;

            while (!deque.isEmpty()) {          // -x
                if (deque.peekLast() < 0) {
                    deque.addLast(x);
                    break;
                }
                if (deque.peekLast() == (x * -1)) {
                    deque.removeLast();
                    deadAst = true;
                    break;
                }
                if (deque.peekLast() < (x * -1)) {
                    deque.removeLast();
                    continue;
                }
                if (deque.peekLast() > (x * -1)) {
                    break;
                }
            }
            if (deque.isEmpty() && !deadAst) {
                deque.addLast(x);
            }
        }

        int[] answer = new int[deque.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = deque.pollFirst();
        }

        return answer;
    }

}
