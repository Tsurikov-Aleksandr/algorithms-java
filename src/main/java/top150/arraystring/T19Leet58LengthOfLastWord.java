package top150.arraystring;

public class T19Leet58LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = " " + s;
        int p = s.length() - 1;
        int lastWordLength = 0;
        while (s.charAt(p) == ' '){
            p--;
        }
        while (s.charAt(p) != ' '){
            p--;
            lastWordLength++;
        }
        return lastWordLength;
    }

    public static void main(String[] args) {
        String t1 = "Hello World"; // 5
        String t2 = "   fly me   to   the moon  "; // 4
        String t3 = "luffy is still joyboy"; // 6
        String t4 = "a"; // 1

        System.out.println(lengthOfLastWord(t4));
    }
}
