package all.medium;

import java.util.ArrayList;
import java.util.List;

public class Medium93RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> answer = new ArrayList<>();

        backtracking(0, s, new StringBuilder(), answer);

        return answer;
    }


    void backtracking(int depth, String s, StringBuilder sb, List<String> answer) {
        if (depth == 3) {
            if (isValid(s)) {
                sb.append(s);
                answer.add(sb.toString());
                sb.setLength(sb.length() - s.length());
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (i >= s.length()) {
                break;
            }
            String temp = s.substring(0, i);
            if (isValid(temp)) {
                sb.append(temp).append(".");

                backtracking(depth + 1, s.substring(i), sb, answer);

                sb.setLength(sb.length() - (temp.length() + 1));
            }
        }
    }

    boolean isValid(String s) {
        if (s.length() > 3 || (s.length() > 1 && s.charAt(0) == '0')) {
            return false;
        }

        int val = Integer.parseInt(s);

        return val >= 0 && val <= 255;
    }


}
