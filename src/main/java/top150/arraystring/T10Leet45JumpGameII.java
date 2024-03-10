package top150.arraystring;

public class T10Leet45JumpGameII {
    public static int jump(int[] nums) {
        int numberSteps = 0;
        int l = 0;
        int r = 0;
        while (r < nums.length - 1) {
            int farthest = 0;
            for (int i = l; i < r + 1; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            l = r + 1;
            r = farthest;
            numberSteps++;
        }
        return numberSteps;
    }

    public static void main(String[] args) {
        int[] t1 = {1, 2, 3, 4, 5}; // 3
        System.out.println(jump(t1));
    }

}
