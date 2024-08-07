package leet75;

public class T75Leet334IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= max1) {
                max1 = n;
            } else if (n <= max2) {
                max2 = n;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 4};
        System.out.println(increasingTriplet(a));
    }
}
