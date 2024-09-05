package all.easy;

public class Easy3079FindTheSumOfEncryptedIntegers {
    public int sumOfEncryptedInt(int[] nums) {
        int answer = 0;

        for (int x : nums) {
            answer += maxNum(x);
        }

        return answer;
    }

    private int maxNum(int n) {
        int maxNum = 0;
        int numLenth = 0;

        while (n > 0) {
            int x = n % 10;
            n /= 10;
            maxNum = Math.max(x, maxNum);
            numLenth++;
        }

        int answer = maxNum;

        for (int i = 0; i < numLenth - 1; i++) {
            answer *= 10;
            answer += maxNum;
        }

        return answer;
    }

}
