package top150.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class T41Leet290WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }

        for(int i =0; i < words.length; i++){
            char mKey = pattern.charAt(i);
            String mValue = words[i];

            if(!map.containsKey(mKey)){
                if(!map.containsValue(mValue)){
                    map.put(mKey, mValue);
                }else{
                    return false;
                }
            }else{
                if(!Objects.equals(map.get(mKey), mValue)){
                    return false;
                }
            }
        }
        return true;

    }
}
