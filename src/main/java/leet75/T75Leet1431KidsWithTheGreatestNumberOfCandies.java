package leet75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T75Leet1431KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int maxCandy = Arrays.stream(candies).max().orElse(0);
        for (int i : candies){
            answer.add(i+ extraCandies >= maxCandy);
        }
        return answer;
    }
}
