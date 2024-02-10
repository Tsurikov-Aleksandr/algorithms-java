import java.util.HashMap;
import java.util.Map;

public class T5Leet169MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.containsKey(n) ? map.get(n) + 1 : 1);
            if (map.get(n) > nums.length / 2) {
                return n;
            }
        }
        return 0;
    }
}
