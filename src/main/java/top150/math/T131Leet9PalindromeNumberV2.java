package top150.math;

public class T131Leet9PalindromeNumberV2 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversed = 0;
        int temp = x;

        while (temp != 0) {
            int lastDigit = temp % 10;
            reversed = (reversed * 10) + lastDigit;
            temp = temp / 10;
        }

        return (x == reversed);
    }
}
