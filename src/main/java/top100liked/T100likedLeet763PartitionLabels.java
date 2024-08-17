package top100liked;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T100likedLeet763PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, i);
        }

        List<Integer> answer = new ArrayList<>();
        int prev = -1; // because start from 0, 1 part = index + 1
        int endCurrentPart = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            endCurrentPart = Math.max(endCurrentPart, map.get(ch));
            if(endCurrentPart == i){
                //add part length
                answer.add(endCurrentPart - prev);
                prev = endCurrentPart;
            }
        }

        return answer;
    }
}
