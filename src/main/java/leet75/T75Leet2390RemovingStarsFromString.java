package leet75;

import java.util.ArrayDeque;
import java.util.Deque;

public class T75Leet2390RemovingStarsFromString {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char x : s.toCharArray()) {
            if (x == '*') {
                stack.pollLast();
            } else {
                stack.addLast(x);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pollFirst());
        }

        return sb.toString();
    }
}
