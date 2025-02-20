public class Solution {

    //Input: s = "abcabcbb"
    //Output: 3
    //Explanation: The answer is "abc", with the length of 3.

    public static int longestSubString(String s){

        int maxLength = 0;
        for (int leftPointer = 0, rightPointer = 0; rightPointer < s.length(); rightPointer++){
            int indexOfLastVisitedChar = s.indexOf(s.charAt(rightPointer), leftPointer);
            if (indexOfLastVisitedChar != rightPointer){
                leftPointer = indexOfLastVisitedChar + 1;
            }
            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
        }
        return maxLength;
    }
}
