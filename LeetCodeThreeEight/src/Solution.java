public class Solution {
    public static int longestSubString(String s) {
                        /// Input: s = "abcabcbb"
        int maxLength = 0;

        // Sliding Algorithm
        for (int leftPointer = 0, rightPointer = 0; rightPointer < s.length(); rightPointer++){
            int indexOfLastSeenCharacter = s.indexOf(s.charAt(rightPointer), leftPointer);
            if (indexOfLastSeenCharacter != rightPointer){
                leftPointer++;
                maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
            }
        }

        return maxLength;
    }
}
