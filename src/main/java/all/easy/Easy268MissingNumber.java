package all.easy;

public class Easy268MissingNumber {
    public int missingNumber(int[] nums) {
        int sumNums = nums.length * (nums.length + 1) / 2;
        for (int x : nums) {
            sumNums -= x;
        }
        return sumNums;
    }
}
