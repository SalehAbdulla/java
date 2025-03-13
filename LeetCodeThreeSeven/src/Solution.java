public class Solution {
    // Input: s = "abcabcbb"

    public static int longestLengthOfSubString(String s){
        int maxLength = 0;

        for (int left = 0, right = 0; right < s.length(); right++){
            int indexOfLastVisitedChar = s.indexOf(s.charAt(right), left);

            if (indexOfLastVisitedChar != right){
                left = indexOfLastVisitedChar + 1;
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }
}
