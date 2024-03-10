package top150.intervals;

import java.util.ArrayList;
import java.util.List;

public class T48Leet228SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        if (nums.length == 0) {
            return answer;
        }

        int start = nums[0];
        int end = nums[0];
        for (int x = 1; x < nums.length; x++) {
            if (nums[x] - 1 == end) {
                end = nums[x];
            } else {
                answer.add(start == end ? String.valueOf(start) : start + "->" + end);
                start = nums[x];
                end = nums[x];
            }
        }
        answer.add(start == end ? String.valueOf(start) : start + "->" + end);
        return answer;
    }
}
