package top150.bitmanipulation;

public class T129Leet137SingleNumberII {
    public int singleNumber(int[] nums) {
//        int ans = 0;
//
//        for (int i = 0; i < 32; i++) {
//            int sum = 0;
//            for (int num : nums)
//                sum += num >> i & 1;
//            sum %= 3;
//            ans |= sum << i;
//        }
//
//        return ans;

        int ones = 0;
        int twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}
