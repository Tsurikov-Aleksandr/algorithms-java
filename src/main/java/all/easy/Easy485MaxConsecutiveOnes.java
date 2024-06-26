package all.easy;

public class Easy485MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tempMax = 0;
        int answer = 0;

        for (int num : nums) {
            if (num == 1) {
                tempMax++;
            } else {
                answer = Math.max(tempMax, answer);
                tempMax = 0;
            }
        }

        answer = Math.max(tempMax, answer);

        return answer;
    }
}
