package leet75;

public class T75Leet605CanPlaceFlowersV2 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        int placedFlowers = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                if (i == length - 1 || (i + 1 < length && flowerbed[i + 1] == 0)) {
                    placedFlowers++;
                    if (placedFlowers == n) {
                        return true;
                    }
                    i++;
                }
            } else {
                i++;
            }
        }

        return false;
    }
}
