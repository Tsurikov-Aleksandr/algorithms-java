package leet75;

import java.util.ArrayDeque;
import java.util.Deque;

public class T75Leet739DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        //for index of temperature in array
        Deque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peekLast()]) {
                stack.pollLast();
            }
            if (!stack.isEmpty()) {
                answer[i] = stack.peekLast() - i;
            }
            stack.addLast(i);
        }

        return answer;
    }


}
