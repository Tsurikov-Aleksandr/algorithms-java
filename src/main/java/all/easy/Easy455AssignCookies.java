package all.easy;

import java.util.Arrays;

public class Easy455AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gPoint = 0;
        int sPoint = 0;
        int answer = 0;

        while (gPoint < g.length && sPoint < s.length){
            if(g[gPoint] <= s[sPoint]){
                answer++;
                gPoint++;
                sPoint++;
            }else{
                sPoint++;
            }
        }

        return answer;
    }
}
