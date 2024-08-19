package top100liked;

import java.util.HashSet;
import java.util.Set;

public class T100likedLeet287FindTheDuplicateNumber {

    //20ms Beat 35.18%
    public int findDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) {
                return x;
            }
            set.add(x);
        }
        return -1;
    }


    //Runtime 1 ms Beats 100.00%
    public int findDuplicate2(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for (int num : nums) {
            if (visited[num]) {
                return num;
            }

            visited[num] = true;
        }
        return -1;
    }
}
