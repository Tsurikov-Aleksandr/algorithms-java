package top150.math;

public class T132Leet66PlusOne {
    public int[] plusOne(int[] digits) {
        int end = digits.length - 1;
        int temp = 1;
        while (temp != 0 && end >= 0) {
            int last = (digits[end] + temp) % 10;
            temp = (digits[end] + temp) / 10;
            digits[end] = last;
            end--;
        }
        if (temp > 0) {
            int[] answer = new int[digits.length + 1];
            answer[0] = temp;
            System.arraycopy(digits, 0, answer, 1, answer.length - 1);
            return answer;
        } else {
            return digits;
        }

    }
}
