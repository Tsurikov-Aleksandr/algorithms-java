package all.easy;

public class Easy504Base7 {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        int last;
        boolean minus = false;

        if (num < 0) {
            num *= -1;
            minus = true;
        }

        while (num > 6) {
            last = num % 7;
            num /= 7;
            sb.append(last);
        }

        sb.append(num);

        if (minus) {
            sb.append('-');
        }

        return sb.reverse().toString();
    }
}
