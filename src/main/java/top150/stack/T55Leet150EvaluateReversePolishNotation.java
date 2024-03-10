package top150.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class T55Leet150EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Deque<String> stack = new ArrayDeque<>();

        for (String x : tokens) {
            if (Objects.equals(x, "+")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int r = b + a;
                stack.push(String.valueOf(r));
            } else if (Objects.equals(x, "-")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int r = b - a;
                stack.push(String.valueOf(r));
            } else if (Objects.equals(x, "/")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int r = b / a;
                stack.push(String.valueOf(r));
            } else if (Objects.equals(x, "*")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int r = b * a;
                stack.push(String.valueOf(r));
            } else {
                stack.push(x);
            }
        }

        return Integer.parseInt(stack.pop());

    }

    public static void main(String[] args) {
        String[] s1 = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(s1));
    }
}
