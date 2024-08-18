package top100liked;

import java.util.HashMap;
import java.util.Map;

public class T100likedLeet560SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                answer += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }
}
