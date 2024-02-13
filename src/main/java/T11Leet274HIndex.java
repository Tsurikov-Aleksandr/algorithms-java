import java.util.Arrays;

public class T11Leet274HIndex {
    public static int hIndex(int[] citations) {
        int f = 0;
        Arrays.sort(citations);
        int i = citations.length - 1;
        while (i >= 0 && citations[i] > f) {
            f++;
            i--;
        }
        return f;
    }

    public static void main(String[] args) {
        int[] t1 = {1};
        System.out.println(hIndex(t1));
    }

}
