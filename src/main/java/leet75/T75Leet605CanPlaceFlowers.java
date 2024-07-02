package leet75;

public class T75Leet605CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int usedPlace = 0;
        int preFirst = 1;
        int preSecond = 0;

        for (int i : flowerbed) {
            if (i == 0 && preSecond == 0 && preFirst == 0) {
                usedPlace++;
                preFirst = 1;
                preSecond = i;
            } else {
                preFirst = preSecond;
                preSecond = i;
            }
        }

        if (preFirst == 0 && preSecond == 0) {
            usedPlace++;
        }

        System.out.println(usedPlace);

        return usedPlace >= n;
    }
}
