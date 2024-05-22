package all.easy;


public class Easy278FirstBadVersion {
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (!isBadVersion(mid)) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return first;
    }


    private boolean isBadVersion(int version) {
        return true;
    }

}
