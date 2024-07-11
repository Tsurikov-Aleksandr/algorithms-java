package leet75;

public class T75Leet1732FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxGain = 0;
        int tempGain = 0;

        for (int x : gain) {
            tempGain += x;
            maxGain = Math.max(tempGain, maxGain);
        }

        return maxGain;
    }
}
