package all.easy;

public class Easy507PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i * i < num; i++) {
            if (num % i == 0) {
                if (i != (num / i)) {
                    sum = sum + i;
                    sum = sum + (num / i);
                } else {
                    sum = sum + i;
                }
            }
        }

        return (sum - num) == num;
    }
}
