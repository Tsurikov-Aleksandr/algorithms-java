package top150.math;

public class T134Leet69sqrt {
    public int mySqrt(int x) {

        if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid * mid == x) {
                return mid;
            }

            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else {
                start = mid + 1;
            }
        }

        return end;
    }
}
