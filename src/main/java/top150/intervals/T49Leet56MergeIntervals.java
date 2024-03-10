package top150.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class T49Leet56MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> list = new ArrayList<>();
        int[] prev = intervals[0];

        for (int[] x : intervals) {
            if (prev[1] >= x[0]) {
                prev[1] = Math.max(prev[1], x[1]);
            } else {
                list.add(prev.clone());
                prev = x;
            }
        }
        list.add(prev);
        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {4, 5}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
