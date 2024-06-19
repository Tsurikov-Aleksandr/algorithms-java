package all.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Easy448FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        int[] arr = new int[nums.length];
        Arrays.fill(arr, -1);
        for (int i : nums) {
            arr[i - 1] = i;
        }

        for (int i = 0; i < nums.length; i++) {
            if (arr[i] == -1) {
                answer.add(i + 1);
            }
        }

        return answer;
    }
}
