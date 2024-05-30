package all.easy;

public class Easy367ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }

        long low = 1;
        long high = num / 2;
        long mid;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if ((mid * mid) == (long) num) {
                return true;
            } else if ((mid * mid) < (long) num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
