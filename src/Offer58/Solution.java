package Offer58;

class Solution {

    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=strings.length-1; i>=0; i--) {
            String tmp = strings[i];
            if (!strings[i].equals("")) {
                stringBuffer.append(strings[i]);
                if (i != 0) {
                    stringBuffer.append(" ");
                }
            }
        }
        return stringBuffer.toString().trim();
    }

    public static void main(String[] args) {
        String s = "  a good   example  ";
        Solution solution = new Solution();
        String res = solution.reverseWords(s);
        System.out.println(res);
    }
}
