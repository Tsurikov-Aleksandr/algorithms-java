package top100liked;

import java.util.ArrayList;
import java.util.List;

public class T100liked131PalindromePartitioning {
    private final List<List<String>> answer = new ArrayList<>();

    public List<List<String>> partition(String s) {
        palindromePartition(0, new ArrayList<>(), s);

        return answer;
    }

    private void palindromePartition(int start, List<String> curList, String str) {
        if (start == str.length()) {
            answer.add(new ArrayList<>(curList));
            return;
        }

        for (int i = start; i < str.length(); i++) {
            if (checkPalindrome(str, start, i)) {
                curList.add(str.substring(start, i + 1));

                palindromePartition(i + 1, curList, str);

                curList.remove(curList.size() - 1);
            }
        }

    }

    private boolean checkPalindrome(String str, int startIndex, int lastIndex) {
        while (startIndex <= lastIndex) {
            if (str.charAt(startIndex) != str.charAt(lastIndex)) {
                return false;
            }
            startIndex++;
            lastIndex--;
        }

        return true;
    }
}
