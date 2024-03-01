package top150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class T44Leet1TwoSum {
    public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> complements = new HashMap<>();

            for (int i = 0; i < nums.length; i++){
                Integer complementIdex = complements.get(nums[i]);
                if (complementIdex != null){
                    return new int[]{i, complementIdex};
                }
                complements.put(target-nums[i], i);
            }

            return nums;
        }
}
