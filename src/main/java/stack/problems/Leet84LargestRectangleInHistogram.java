package stack.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leet84LargestRectangleInHistogram {
    public record Pair(int index, int height) {
    }

    public static int largestRectangleArea(int[] heights) {
        int answer = 0;
        Deque<Pair> stack = new ArrayDeque<>();

        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.isEmpty() && stack.peek().height() > heights[i]) {
                Pair prew = stack.pop();
                answer = Math.max(answer, prew.height() * (i - prew.index()));
                start = prew.index();
            }
            stack.push(new Pair(start, heights[i]));
        }

        for (Pair p : stack) {
            answer = Math.max(answer, p.height * (heights.length - p.index()));
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] h1 = {2, 1, 5, 6, 2, 3}; // 10
        int[] h2 = {2, 4}; // 4
        System.out.println(largestRectangleArea(h1));
    }
}
