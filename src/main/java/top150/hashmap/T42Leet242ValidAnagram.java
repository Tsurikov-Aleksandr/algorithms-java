package top150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class T42Leet242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()){
            map.put(x, map.containsKey(x) ? map.get(x) + 1 : 1);
        }
        for (char y : t.toCharArray()){
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
