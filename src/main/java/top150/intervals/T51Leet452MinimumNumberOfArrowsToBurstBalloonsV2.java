package top150.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class T51Leet452MinimumNumberOfArrowsToBurstBalloonsV2 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int LastEnd = points[0][1];
        int arrows = 1;

        for (int i = 1; i < points.length; i++) {
            if (LastEnd < points[i][0]) {
                arrows++;
                LastEnd = points[i][1];
            }
        }

        return arrows;
    }
}
