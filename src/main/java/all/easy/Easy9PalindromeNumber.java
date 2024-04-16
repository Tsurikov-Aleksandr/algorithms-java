package all.easy;

public class Easy9PalindromeNumber {
    public boolean isPalindrome(int x) {
        String xs = String.valueOf(x);
        int l = 0;
        int r = xs.length() - 1;
        while (l < r) {
            if (xs.charAt(l) != xs.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
