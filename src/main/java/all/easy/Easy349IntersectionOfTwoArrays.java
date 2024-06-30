package all.easy;

import java.util.HashSet;

public class Easy349IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int k : nums1) {
            set.add(k);
        }

        HashSet<Integer> hashset = new HashSet<>();

        for (int k : nums2) {
            if (set.contains(k)) {
                hashset.add(k);
            }
        }

        int[] answer = new int[hashset.size()];
        int x = 0;

        for (int i : hashset) {
            answer[x] = i;
            x++;
        }

        return answer;
    }
}
