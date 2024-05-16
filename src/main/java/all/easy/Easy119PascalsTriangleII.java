package all.easy;

import java.util.ArrayList;
import java.util.List;

public class Easy119PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        long prev = 1;

        for (int k = 1; k <= rowIndex; k++) {
            long next_val = prev * (rowIndex - k + 1) / k;
            answer.add((int) next_val);
            prev = next_val;
        }

        return answer;
    }
}
