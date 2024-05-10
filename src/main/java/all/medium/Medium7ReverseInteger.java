package all.medium;

public class Medium7ReverseInteger {
    public static int reverse(int x) {
        int prevRev = 0;
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            // check overflow
            if ((rev - x % 10) / 10 != prevRev) {
                return 0;
            }
            prevRev = rev;
            x = x / 10;
        }
        return rev;
    }
}
