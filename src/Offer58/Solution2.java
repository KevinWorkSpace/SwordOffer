package Offer58;

public class Solution2 {

    public String reverseWords(String s) {
        String string = s.trim();
        StringBuffer res = new StringBuffer();
        int i = string.length() - 1;
        int j = i;
        while (j >= 0) {
            while (i >= 0 && string.charAt(i) != ' ') i--;
            res.append(string.substring(i+1, j+1) + " ");
            while (i >= 0 && string.charAt(i) == ' ') i--;
            j = i;
        }
        return res.toString().trim();
    }
}
