package top150.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class T123Leet373FindKPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> (a[0] + a[1])));

        for (int i = 0; i < nums1.length && i < k; i++)
            minHeap.add(new int[]{nums1[i], nums2[0], 0});

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < k && !minHeap.isEmpty(); i++) {
            int[] curr = minHeap.poll();
            result.add(List.of(curr[0], curr[1]));
            int nums2Idx = curr[2];
            if (nums2Idx < nums2.length - 1)
                minHeap.add(new int[]{curr[0], nums2[nums2Idx + 1], nums2Idx + 1});
        }
        return result;
    }
}
