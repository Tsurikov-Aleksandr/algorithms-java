package top150.twopointers;

public class T28Leet11ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int answer = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            answer = Math.max(answer, Math.min(height[start], height[end]) * (end - start));
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7}; // 49
        int[] height2 = {1, 1}; // 1
        int[] height3 = {0, 1}; // 0
        System.out.println(maxArea(height3));
    }
}
