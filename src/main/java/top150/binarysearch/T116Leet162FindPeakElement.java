package top150.binarysearch;

public class T116Leet162FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int left = 0;
        int rigth = nums.length - 1;
        while (left < rigth) {
            int mid = left + (rigth - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                rigth = mid;
            }
        }
        return left;
    }
}
