package stack.problems;

public class Leet32LongestValidParenthesesWithoutStackSolution {
    public static int longestValidParentheses(String s) {
        int open = 0;
        int close = 0;
        int maxLenght = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                maxLenght = Math.max(maxLenght, (close + open));
            } else if (close > open) {
                open = 0;
                close = 0;
            }
        }

        open = 0;
        close = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                maxLenght = Math.max(maxLenght, (close + open));
            } else if (open > close) {
                open = 0;
                close = 0;
            }
        }

        return maxLenght;
    }


    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()")); // 2
        System.out.println(longestValidParentheses(")()())")); // 4
        System.out.println(longestValidParentheses("")); // 0
        System.out.println(longestValidParentheses("()(()")); // 2
        System.out.println(longestValidParentheses(")()(((())))(")); // 10 Wrong Answer 216 / 231 testcases passed
    }
}
