package top150.binarysearch;

public class T114Leet35SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int rigth = nums.length - 1;
        while (left <= rigth) {
            int mid = left + (rigth - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                rigth = mid - 1;
            }
        }
        return left;
    }
}
