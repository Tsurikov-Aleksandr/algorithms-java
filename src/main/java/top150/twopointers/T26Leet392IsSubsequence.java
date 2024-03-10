package top150.twopointers;

public class T26Leet392IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length()){
            boolean finded = false;
            while (tPointer < t.length()){
                if(t.charAt(tPointer) == s.charAt(sPointer)){
                    finded = true;
                    tPointer++;
                    break;
                }
                tPointer++;
            }
            if(!finded){
                return false;
            }
            sPointer++;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t)); // s is Subsequence in t = true
    }
}
