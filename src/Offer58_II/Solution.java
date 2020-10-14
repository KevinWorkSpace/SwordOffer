package Offer58_II;

class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s.substring(n, s.length()));
        stringBuffer.append(s.substring(0, n));
        return stringBuffer.toString();
    }
}
