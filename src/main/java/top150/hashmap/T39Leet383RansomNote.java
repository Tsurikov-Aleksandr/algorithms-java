package top150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class T39Leet383RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        for (char x : magazine.toCharArray()) {
            map.put(x, map.containsKey(x) ? map.get(x) + 1 : 1);
        }

        for (char y : ransomNote.toCharArray()){
            if(!map.containsKey(y)){
                return false;
            }
            map.put(y, map.get(y) - 1);
            if(map.get(y) == 0){
                map.remove(y);
            }
        }

        return true;
    }
}
