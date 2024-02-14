package top150.arraystring;

import java.util.Arrays;

public class T15Leet135Candy {
    public int candy(int[] ratings) {
        int[] candyArr = new int[ratings.length];
        Arrays.fill(candyArr, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i - 1] < ratings[i]) {
                candyArr[i] = candyArr[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i + 1] < ratings[i]) {
                candyArr[i] = Math.max(candyArr[i], candyArr[i + 1] + 1);
            }
        }
        return Arrays.stream(candyArr).sum();
    }
}
