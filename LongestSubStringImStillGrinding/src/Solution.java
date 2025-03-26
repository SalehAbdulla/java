public class Solution {

                                    // Input: s = "abcabcbb"
    public static int longestSubString(String s){

        int maxlength =  0;
        for (int left = 0, right = 0; right < s.length(); right++) {

            int indexOfLastVisitedCharacter = s.indexOf(s.charAt(right), left);

            if (indexOfLastVisitedCharacter != right){
                left = indexOfLastVisitedCharacter + 1;
            }

            maxlength = Math.max(maxlength, right - left + 1);
        }

        return maxlength;
    }
}
