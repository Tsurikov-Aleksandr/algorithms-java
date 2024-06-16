package all.easy;

public class Easy374GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                start = mid + 1;
            } else if (guess(mid) == -1) {
                end = mid - 1;
            }
        }

        return -1;

    }
    private int guess(int n){
        // @return 	   -1 if num is higher than the picked number
        //    		    1 if num is lower than the picked number
        //              otherwise return 0
        return -1;
    }
}
