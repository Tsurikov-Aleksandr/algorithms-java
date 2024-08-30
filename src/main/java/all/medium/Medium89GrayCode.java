package all.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Medium89GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(0);

        for (int i = 1; i <= n; i++) {
            List<Integer> rev = new ArrayList<>(answer);
            Collections.reverse(rev);
            int val = (int) Math.pow(2, i - 1);
            for (int v : rev) {
                answer.add(v + val);
            }
        }

        return answer;
    }


    public List<Integer> grayCode2(int n) {
        List<Integer> result = new ArrayList<>();
        int totalCodes = 1 << n; // 2^n
        for (int i = 0; i < totalCodes; i++) {
            result.add(i ^ (i >> 1)); // i XOR (i right-shifted by 1)
        }
        return result;
    }
}
