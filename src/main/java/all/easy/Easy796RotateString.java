package all.easy;

import java.util.ArrayList;
import java.util.List;

public class Easy796RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        List<Integer> pointList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == goal.charAt(0)) {
                pointList.add(i);
            }
        }

        if (pointList.isEmpty()) {
            return false;
        }

        for (int x : pointList) {
            if (tryString(s, goal, x)) {
                return true;
            }
        }

        return false;
    }

    private boolean tryString(String s, String goal, int point) {
        for (int j = 0; j < goal.length(); j++) {
            if (s.charAt(point) != goal.charAt(j)) {
                return false;
            }
            if (point == s.length() - 1) {
                point = 0;
            } else {
                point++;
            }
        }

        return true;
    }
}
