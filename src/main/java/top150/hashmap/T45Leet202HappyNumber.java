package top150.hashmap;

import java.util.HashSet;
import java.util.Set;

public class T45Leet202HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<>();
        while (!visit.contains(n)) {
            visit.add(n);
            n = sumOfSquares(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    public static int sumOfSquares(int x) {
        int answer = 0;
        while (x != 0) {
            answer += (x % 10) * (x % 10);
            x /= 10;
        }
        return answer;
    }

}
