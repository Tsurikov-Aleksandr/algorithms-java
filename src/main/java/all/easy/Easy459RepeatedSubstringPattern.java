package all.easy;

public class Easy459RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int repit = 2;
        for (int i = len / 2; i > 0; i--) {
            if (len % i == 0) {
                repit = len / i;
                String sub = s.substring(0, i);
                String repSt = sub.repeat(repit);
                if (s.equals(repSt)) {
                    return true;
                }
            }
        }
        return false;
    }
}
