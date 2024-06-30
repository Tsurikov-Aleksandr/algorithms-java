package all.easy;

public class Easy476NumberComplement {
    public int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}
