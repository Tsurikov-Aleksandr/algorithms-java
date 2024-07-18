package leet75;

import java.util.ArrayDeque;
import java.util.Deque;

public class T75Leet394DecodeString {
    public String decodeString(String s) {
        //2[abc]3[cd]ef  3[a2[c]]
        Deque<Integer> stackForNumbers = new ArrayDeque<>();
        Deque<StringBuilder> stackForStrings = new ArrayDeque<>();
        StringBuilder answer = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                stackForNumbers.push(n);
                n = 0;
                stackForStrings.push(answer);
                answer = new StringBuilder();
            } else if (c == ']') {
                int k = stackForNumbers.pop();
                StringBuilder temp = answer;
                answer = stackForStrings.pop();
                while (k > 0) {
                    answer.append(temp);
                    k--;
                }
            } else {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
