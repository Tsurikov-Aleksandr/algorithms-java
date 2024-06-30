package leet75;

public class T75Leet1768MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int point1 = 0;
        int point2 = 0;
        StringBuilder sb = new StringBuilder();

        while (point1 < word1.length() && point2 < word2.length()){
            sb.append(word1.charAt(point1));
            sb.append(word2.charAt(point2));
            point1++;
            point2++;
        }

        while (point1 < word1.length()){
            sb.append(word1.charAt(point1));
            point1++;
        }

        while (point2 < word2.length()){
            sb.append(word2.charAt(point2));
            point2++;
        }

        return sb.toString();
    }
}
