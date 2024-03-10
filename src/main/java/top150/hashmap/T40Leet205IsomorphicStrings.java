package top150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class T40Leet205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);

            if ((mapST.containsKey(cS) && mapST.get(cS) != cT) || (mapTS.containsKey(cT) && mapTS.get(cT) != cS)) {
                return false;
            }
            mapST.put(cS, cT);
            mapTS.put(cT, cS);

        }

        return true;
    }
}
