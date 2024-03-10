package top150.arraystring;

public class T16Leet42TrappingRainWater {
    public static int trap(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int start = 0;
        int end = height.length - 1;
        int maxStart = height[0];
        int maxEnd = height[height.length - 1];
        int water = 0;
        while (start < end) {
            if (maxStart < maxEnd) {
                start++;
                if (height[start] < maxStart) {
                    water += (maxStart - height[start]);
                } else {
                    maxStart = height[start];
                }
            } else {
                end--;
                if (height[end] < maxEnd) {
                    water += (maxEnd - height[end]);
                } else {
                    maxEnd = height[end];
                }
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] t1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; // 6
        int[] t2 = {4, 2, 0, 3, 2, 5}; // 9
        int[] t3 = {2, 1}; //0

        System.out.println(trap(t3));
    }
}
