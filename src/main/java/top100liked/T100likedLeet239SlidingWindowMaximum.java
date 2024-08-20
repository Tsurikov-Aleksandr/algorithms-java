package top100liked;

import java.util.ArrayDeque;
import java.util.Deque;

public class T100likedLeet239SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }

        int[] answer = new int[nums.length - k + 1];
        int answerIndex = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.addLast(i);

            if (i >= k - 1) {
                answer[answerIndex] = nums[deque.peekFirst()];
                answerIndex++;
            }
        }

        return answer;
    }
}
