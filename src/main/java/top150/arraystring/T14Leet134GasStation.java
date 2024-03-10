package top150.arraystring;

import java.util.Arrays;

public class T14Leet134GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = Arrays.stream(gas).sum();
        int costSum = Arrays.stream(cost).sum();
        if (gasSum < costSum) {
            return -1;
        }
        int total = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);

            if (total < 0) {
                total = 0;
                start = i + 1;
            }
        }
        return start;
    }
}
