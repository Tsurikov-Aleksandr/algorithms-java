package top150.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class T51Leet452MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));

        int[] withArrow = new int[points.length];
        Arrays.fill(withArrow, 0);
        int arrows = 0;

        for(int i = 0; i < points.length; i++){
            if(withArrow[i] == 1){
                continue;
            }
            withArrow[i] = 1;
            arrows++;
            System.out.println(i); // point
            for(int k = i; k< points.length; k++){
                if(withArrow[k] == 1){
                    continue;
                }
                if (points[k][1] >= points[i][0] && points[k][1] <= points[i][1]
                        || points[k][0] <= points[i][1] && points[k][0] >= points[i][0]){
                    withArrow[k] = 1;
                    points[i][0] = Math.max(points[i][0], points[k][0]);
                    points[i][1] = Math.min(points[i][1], points[k][1]);
                }
            }
        }
        return arrows;
    }
}
