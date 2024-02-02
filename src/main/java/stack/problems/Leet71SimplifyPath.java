package stack.problems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Leet71SimplifyPath {
    public static String simplifyPath(String path) {

        Deque<String> stack = new ArrayDeque<>();
        String cur = "";
        path += "/";

        for (int i = 0; i < path.length(); i++) {
            char x = path.charAt(i);
            if (x == '/') {
                if (cur.equals("..")) {
                    if (!(stack.isEmpty())) {
                        stack.pop();
                    }
                } else if (!(Objects.equals(cur, "")) && (!Objects.equals(cur, "."))) {
                    stack.push(cur);
                }
                cur = "";

            } else {
                cur += x;
                System.out.println(cur);
            }
        }

        if(stack.isEmpty()){
            return "/";
        }

        String answer = "";

        for (String w : stack) {
            answer = "/" + w + answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        String p1 = "/../abc//./def/";
        String ps1 = "/abc/def";

        String p2 = "/a/b/c/../..";
        String ps2 = "/a";

        System.out.println(simplifyPath(p1));
    }
}
