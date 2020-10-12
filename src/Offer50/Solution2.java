package Offer50;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution2 {

    public char firstUniqChar(String s) {
        LinkedHashMap<Character, Boolean> map = new LinkedHashMap<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, false);
            }
            else map.put(c, true);
        }
        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
            char c = entry.getKey();
            if (entry.getValue()) return c;
        }
        return ' ';
    }
}
