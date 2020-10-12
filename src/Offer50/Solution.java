package Offer50;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, false);
            }
            else map.put(c, true);
        }
        for (char c : s.toCharArray()) {
            if (map.get(c)) return c;
        }
        return ' ';
//        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
//            char c = entry.getKey();
//            if (entry.getValue()) continue;
//            if (v < min) {
//                minKey = c;
//                min = v;
//            }
//        }
    }

    public static void main(String[] args) {
        String s = "aadadaad";
        Solution solution = new Solution();
        char c = solution.firstUniqChar(s);
        System.out.println(c);
    }
}
