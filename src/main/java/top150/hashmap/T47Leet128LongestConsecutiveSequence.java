package top150.hashmap;

import java.util.HashSet;
import java.util.Set;

public class T47Leet128LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        for (int i : nums) {
            int max = 1;
            int prev = i - 1;
            int next = i + 1;
            while (set.contains(prev)) {
                max++;
                set.remove(prev--);
            }

            while (set.contains(next)) {
                max++;
                set.remove(next++);
            }
            answer = Math.max(answer, max);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
