package stack.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leet32LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        int r = longestValidParenthesesOnedirection(s);

        StringBuilder reverseString = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            if (s.charAt(i - 1) == ')') {
                reverseString.append('(');
            } else {
                reverseString.append(')');
            }
        }
        int l = longestValidParenthesesOnedirection(reverseString.toString());
        return Math.max(r, l);
    }

    public static int longestValidParenthesesOnedirection(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int longestLength = 0;
        int tempLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    longestLength = Math.max(longestLength, tempLength);
                    tempLength = 0;
                } else {
                    stack.pop();
                    tempLength++;
                }
            } else {
                stack.push('(');
            }
        }
        if (stack.isEmpty()) {
            longestLength = Math.max(longestLength, tempLength);
        }

        return longestLength * 2;
    }

    public static void main(String[] args) {

        System.out.println(longestValidParentheses("(()")); // 2
        System.out.println(longestValidParentheses(")()())")); // 4
        System.out.println(longestValidParentheses("")); // 0
        System.out.println(longestValidParentheses("()(()")); // 2
        System.out.println(longestValidParentheses(")()(((())))(")); // 10 Wrong Answer 216 / 231 testcases passed

    }
}
