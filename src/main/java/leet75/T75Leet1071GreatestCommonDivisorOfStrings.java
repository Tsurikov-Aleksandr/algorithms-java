package leet75;

public class T75Leet1071GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int p = 1;
        String answer = "";

        while (p <= str1.length() && p <= str2.length()) {
            String temp = str1.substring(0, p);
            String s1 = temp.repeat(str1.length() / p);
            String s2 = temp.repeat(str2.length() / p);

            if (s2.equals(str2) && s1.equals(str1)) {
                answer = temp;

            }

            p++;
        }

        return answer;
    }
}
