package top150.twopointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T27Leet167TwoSumIIInputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            if (map.containsKey(numbers[i])) {
                answer[0] = map.get(numbers[i]) + 1;
                answer[1] = i + 1;
                return answer;
            } else {
                map.put(temp, i);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        Arrays.stream(twoSum(numbers, target)).forEach(System.out::println); // [1,2]
    }
}
