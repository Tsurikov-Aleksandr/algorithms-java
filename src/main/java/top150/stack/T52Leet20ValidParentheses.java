package top150.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class T52Leet20ValidParentheses {
    public boolean isValid(String s) {
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
}
