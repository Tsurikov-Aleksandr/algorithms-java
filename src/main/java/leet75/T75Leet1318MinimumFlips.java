package leet75;

public class T75Leet1318MinimumFlips {
    public int minFlips(int a, int b, int c) {
        return Integer.bitCount(c ^= (a | b)) + Integer.bitCount(a & b & c);
    }
}
