package all.easy;

public class Easy509FibonacciNumber {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int first = 0;
        int second = 1;
        int temp;

        for (int i = 2; i <= n; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }

        return second;
    }
}
