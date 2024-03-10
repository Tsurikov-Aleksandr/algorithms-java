package top150.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class T56Leet224BasicCalculator {
    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int answer = 0;
        int number = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number = 10 * number + Integer.parseInt(String.valueOf(c));
            } else if (c == '+') {
                answer += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                answer += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(answer);
                stack.push(sign);
                sign = 1;
                answer = 0;
            } else if (c == ')') {
                answer += sign * number;
                number = 0;
                answer *= stack.pop();
                answer += stack.pop();

            }
        }
        if (number != 0) {
            answer += sign * number;
        }
        return answer;

    }
}
