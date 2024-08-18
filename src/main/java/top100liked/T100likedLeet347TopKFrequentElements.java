package top100liked;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class T100likedLeet347TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));

        maxHeap.addAll(map.entrySet());

        int[] answer = new int[k];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = maxHeap.poll().getKey();
        }

        return answer;
    }
}
