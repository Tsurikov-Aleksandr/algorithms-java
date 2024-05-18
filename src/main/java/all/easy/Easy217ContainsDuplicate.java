package all.easy;

import java.util.HashSet;
import java.util.Set;

public class Easy217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
