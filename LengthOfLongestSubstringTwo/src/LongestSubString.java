public class LongestSubString {


    public static int longestSubString(String s){
        //Input: s = "abcabcbb"

        int maxLength = 0;

        for (int leftPointer = 0, rightPointer = 0; rightPointer < s.length(); rightPointer++){
            int indexOfLastVisitedChar = s.indexOf(s.charAt(rightPointer), leftPointer);
            if (indexOfLastVisitedChar != rightPointer){
                leftPointer++;
                maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
            }
        }

        return maxLength;
    }



}
