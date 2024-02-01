package stack.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leet20ValidParentheses {
    static boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char check = stack.pop();

            switch (x) {
                case ')' -> {
                    if (check == '{' || check == '[') {
                        return false;
                    }
                }
                case '}' -> {
                    if (check == '(' || check == '[') {
                        return false;
                    }
                }
                case ']' -> {
                    if (check == '{' || check == '(') {
                        return false;
                    }
                }
            }
        }

        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String expr = "([{}])";

        if (isValid(expr))
            System.out.println("Скобочная последовательность валидная");
        else
            System.out.println("Скобочная последовательность не валидная");
    }

}
