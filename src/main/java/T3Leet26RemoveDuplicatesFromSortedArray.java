public class T3Leet26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[p]) {
                p++;
                nums[p] = nums[i];
            }
        }

        p++;
        return p;
    }

}
