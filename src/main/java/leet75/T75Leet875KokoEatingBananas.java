package leet75;

public class T75Leet875KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 1_000_000_000;

        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (canEat(piles, mid, h)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }

        return start;
    }

    public boolean canEat(int[] piles, int k, int h) {
        long hours = 0;

        for (int pile : piles) {
            int div = pile / k;
            hours += div;
            if (pile % k != 0) {
                hours++;
            }
        }

        return hours <= h;
    }
}
