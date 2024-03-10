package top150.arraystring;

public class T23Leet28FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        int index = -1;
        char[] narr = needle.toCharArray();
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int pointer = i;
            boolean equal = true;
            for (char x : narr) {
                if (x != haystack.charAt(pointer)) {
                    equal = false;
                    break;
                }
                pointer++;
            }
            if (equal) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        String haystack3 = "a";
        String needle3 = "a";
        System.out.println(strStr(haystack3, needle3));
    }
}
