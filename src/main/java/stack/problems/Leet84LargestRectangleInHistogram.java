package stack.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leet84LargestRectangleInHistogram {

    public static int largestRectangleArea(int[] heights) {
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <= heights.length; ++i) {
            while (!stack.isEmpty() && (i == heights.length || heights[stack.peek()] > heights[i])) {
                final int h = heights[stack.pop()];
                final int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                ans = Math.max(ans, h * w);
            }
            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] h1 = {2, 1, 5, 6, 2, 3}; // 10
        int[] h2 = {2, 4}; // 4
        System.out.println(largestRectangleArea(h1));
    }
}
