package leet75;

public class T75Leet1137NthTribonacciNumber {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int back1 = 1;
        int back2 = 1;
        int back3 = 2;

        int num = 3;
        int nextN = 4;

        while (num < n) {
            num++;
            nextN = back1 + back2 + back3;
            back1 = back2;
            back2 = back3;
            back3 = nextN;
        }

        return nextN;
    }
}
