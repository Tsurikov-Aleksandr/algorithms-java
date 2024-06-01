package all.easy;

public class Easy389FindTheDifference {
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;

        for(char a : s.toCharArray()){
            sum1 += a;
        }

        for(char b : t.toCharArray()){
            sum2 += b;
        }

        return (char) (sum2 - sum1);
    }
}
