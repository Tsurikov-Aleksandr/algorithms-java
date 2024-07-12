package leet75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T75Leet2215FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        for(int x : nums1){
            set1.add(x);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int y : nums2){
            set2.add(y);
        }

        Set<Integer> setForNum1 = new HashSet<>();
        for(int x : nums1){
            if(!set2.contains(x)){
                setForNum1.add(x);
            }
        }

        Set<Integer> setForNum2 = new HashSet<>();
        for(int x : nums2){
            if(!set1.contains(x)){
                setForNum2.add(x);
            }
        }

        List<Integer>listForNum1 = new ArrayList<>(setForNum1);
        List<Integer>listForNum2 = new ArrayList<>(setForNum2);


        answer.add(listForNum1);
        answer.add(listForNum2);

        return answer;

    }
}
