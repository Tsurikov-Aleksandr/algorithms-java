package top150.twopointers;

public class T25Leet125ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        if(s.length() < 2){
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while (start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama"; // true
        String s2 = "race a car"; // false
        String s3 = " "; // true
        String s4 = "ad "; // false

        System.out.println(isPalindrome(s4));
    }
}
