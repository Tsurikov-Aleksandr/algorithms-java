package all.easy;

public class Easy283MoveZeroes {
    public void moveZeroes(int[] nums) {
//        if (nums == null || nums.length < 2) {
//            return;
//        }
//        for (int i = nums.length - 1; i >= 0; i--) {
//            if (nums[i] == 0) {
//                for (int k = i; k < nums.length - 1; k++) {
//                    nums[k] = nums[k + 1];
//                }
//                nums[nums.length - 1] = 0;
//            }
//        }

        int insertPoint = 0;
        for(int num : nums){
            if(num != 0 ){
                nums[insertPoint] = num;
                insertPoint++;
            }
        }

        while(insertPoint < nums.length){
            nums[insertPoint] = 0;
            insertPoint++;
        }
    }
}
