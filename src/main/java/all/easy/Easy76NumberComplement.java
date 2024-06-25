package all.easy;

public class Easy76NumberComplement {
    public String licenseKeyFormatting(String s, int k) {
        int len = 0;
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        s = s.toUpperCase();

        while (i >= 0) {
            if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
                if (len == k) {
                    sb.append('-');
                    len = 0;
                }
                sb.append(s.charAt(i));
                len++;

            }
            i--;
        }
        return sb.reverse().toString();
    }
}
