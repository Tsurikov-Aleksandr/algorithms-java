package leet75;

import java.util.HashMap;
import java.util.Map;

public class T75Leet1679MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for (int num : nums) {
            if (map.containsKey(k - num) && map.get(k - num) > 0) {
                answer++;
                map.put((k - num), (map.get(k - num) - 1));
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return answer;
    }
}
