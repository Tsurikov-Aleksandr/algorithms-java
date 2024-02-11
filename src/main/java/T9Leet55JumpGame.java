public class T9Leet55JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        boolean canJump = true;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0) {
                canJump = false;
                int p = i;
                int jump = 2;
                while (p > 0) {
                    p--;
                    if (nums[p] >= jump) {
                        i = p;
                        canJump = true;
                        break;
                    }
                    jump++;
                }
                if (!canJump) {
                    return canJump;
                }
            }
        }
        return canJump;
    }

    public static void main(String[] args) {
        int[] t8 = {2, 0, 0};
        System.out.println(canJump(t8));
    }
}
