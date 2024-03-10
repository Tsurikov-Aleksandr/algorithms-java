package top150.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class T54Leet155MinStack {
    int min = Integer.MAX_VALUE;
    Deque<Integer> stack = new ArrayDeque<>();

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min) min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
