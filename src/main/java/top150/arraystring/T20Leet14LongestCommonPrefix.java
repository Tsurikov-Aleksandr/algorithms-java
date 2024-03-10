package top150.arraystring;

public class T20Leet14LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefixStart = strs[0];
        int end = prefixStart.length();
        for (String str : strs) {
            if (str.isEmpty()) {
                return "";
            }
            end = Math.min(end, str.length());
            for (int i = 0; i < end; i++) {
                if (prefixStart.charAt(i) != str.charAt(i)) {
                    end = i;
                }
            }

        }
        return prefixStart.substring(0, end);
    }

    public static void main(String[] args) {
        String[] t1 = {"flower", "flow", "flight"};
        String[] t2 = {"dog", "racecar", "car"};
        String[] t3 = {"", "d", "d"};
        String[] t4 = {"cir", "car"};
        String[] t5 = {"q"};
        String[] t6 = {"flower", "flower", "flower", "flower"};
        System.out.println(longestCommonPrefix(t6));
    }
}
