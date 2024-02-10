import java.util.Arrays;

public class T6Leet189RotateArray {
    public static void rotate(int[] nums, int k) {
        if (k >= nums.length) {
            k = k % nums.length;
        }
        int p1 = 0;
        int p2 = nums.length - 1;
        int temp;
        while (p1 < p2) {
            temp = nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = temp;
            p1++;
            p2--;
        }
        p1 = 0;
        p2 = k - 1;
        while (p1 < p2) {
            temp = nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = temp;
            p1++;
            p2--;
        }
        p1 = k;
        p2 = nums.length - 1;
        while (p1 < p2) {
            temp = nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = temp;
            p1++;
            p2--;
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; //5,6,7,1,2,3,4
        int k = 3;
        rotate(nums, k);
        Arrays.stream(nums).forEach(System.out::print);
    }
}
