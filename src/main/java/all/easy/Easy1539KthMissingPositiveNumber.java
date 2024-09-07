package all.easy;

public class Easy1539KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int currentNumber = 1;
        int point = 0;

        while (k > 0 && point < arr.length) {
            if (arr[point] == currentNumber) {
                point++;
                currentNumber++;
            } else {
                k--;
                currentNumber++;
            }
        }

        return currentNumber + k - 1;
    }
}
