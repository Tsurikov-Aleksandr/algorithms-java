package top150.intervals;

import java.util.ArrayList;
import java.util.List;

public class T50Leet57InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();

        for(int[] x : intervals){
            if(x[1] < newInterval[0]){
                list.add(x);
            }else if(x[0] > newInterval[1]){
                list.add(newInterval);
                newInterval = x;
            }else{
                newInterval[0] = Math.min(newInterval[0], x[0]);
                newInterval[1] = Math.max(newInterval[1], x[1]);
            }
        }

        list.add(newInterval);

        return list.toArray(new int[list.size()][]);

    }
}
