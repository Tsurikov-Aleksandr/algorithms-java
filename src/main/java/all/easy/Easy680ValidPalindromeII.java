package all.easy;

public class Easy680ValidPalindromeII {

    //179 ms Beat 5.52%
    public boolean validPalindrome(String s) {
        return palindrome(s, 0, s.length() - 1, 0);
    }

    private boolean palindrome(String s, int start, int end, int diff) {
        if (diff > 1) {
            return false;
        }

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return palindrome(s, start + 1, end, diff + 1)
                        || palindrome(s, start, end - 1, diff + 1);
            }
            start++;
            end--;
        }

        return true;
    }

    //4 ms
    //Beats 99.37%

    public boolean validPalindrome2(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return validPalindromeShort(s, start + 1, end) || validPalindromeShort(s, start, end - 1);
            }
            start++;
            end--;
        }

        return true;
    }

    public boolean validPalindromeShort(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

}
