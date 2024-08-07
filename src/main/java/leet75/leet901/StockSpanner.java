package leet75.leet901;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanner {
    Deque<int[]> stack;

    public StockSpanner() {
        stack = new ArrayDeque<>();
    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peekLast()[0] <= price) {
            span += stack.pollLast()[1];
        }

        stack.addLast(new int[]{price, span});

        return span;
    }
}
