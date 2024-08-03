package leet75;

import java.util.Arrays;

public class T75Leet2300SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] answer = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int start = 0;
            int end = potions.length - 1;
            int mid = start + (end - start) / 2;

            while (start <= end) {
                if ((long) spells[i] * potions[mid] >= success) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                mid = start + (end - start) / 2;
            }

            answer[i] = potions.length - start;
        }

        return answer;
    }
}
