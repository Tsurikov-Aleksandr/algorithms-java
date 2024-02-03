package stack.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leet71SimplifyPath {
    public static String simplifyPath(String path) {

        Deque<String> stack = new ArrayDeque<>();

        StringBuilder cur2 = new StringBuilder();

        path += "/";

        for (int i = 0; i < path.length(); i++) {
            char x = path.charAt(i);
            if (x == '/') {
                if (cur2.toString().equals("..")) {
                    if (!(stack.isEmpty())) {
                        stack.pop();
                    }
                } else if (!cur2.toString().isEmpty() && !cur2.toString().equals(".")) {
                    stack.push(cur2.toString());
                }
                cur2.setLength(0);

            } else {
                cur2.append(x);

            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        for (String w : stack) {
            cur2.insert(0, w);
            cur2.insert(0, "/");
        }

        return cur2.toString();
    }

    public static void main(String[] args) {
        String p1 = "/../abc//./def/"; // "/abc/def"
        String p2 = "/a/b/c/../.."; // "/a"

        String pl1 = "/home/";      // "/home"
        String pl2 = "/../";        // "/"
        String pl3 = "/home//foo/"; // "/home/foo"

        System.out.println(simplifyPath(pl3));
    }
}
