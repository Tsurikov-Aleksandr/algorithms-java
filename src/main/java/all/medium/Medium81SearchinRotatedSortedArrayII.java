package all.medium;

public class Medium81SearchinRotatedSortedArrayII {
    //0 ms Beats 100.00% ))))
    public boolean search1(int[] nums, int target) {
        for (int x : nums) {
            if (x == target) {
                return true;
            }
        }
        return false;
    }

    public boolean search2binary(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) return true;

            //if there are duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }

            //left half is sorted
            else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target <= nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

            //right half is sorted
            else {
                if (target <= nums[end] && target >= nums[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return false;
    }
}
