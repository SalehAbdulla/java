import java.util.HashMap;

public class Solution {
                    //Input: s = "abcabcbb"
    public static int longestSubString(String s){

        int maxLength = 0;

        for (int lPointer = 0, rPointer = 0; rPointer < s.length(); rPointer++){
            int indexOfLastVisitedChar = s.charAt(s.indexOf(rPointer, lPointer));
            if (indexOfLastVisitedChar != rPointer){
                lPointer = indexOfLastVisitedChar + 1;
            }
            maxLength = Math.max(maxLength, rPointer - lPointer + 1);
        }

        return maxLength;
    }



}
