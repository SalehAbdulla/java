package dev.lpa;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(longestSubString(s));
    }

    public static int longestSubString(String s){
        int maxLength = 0;
        for (int leftPointer = 0, rightPointer = 0; rightPointer < s.length(); rightPointer++){
            int indexOfLastVisitedChar = s.indexOf(s.charAt(rightPointer), leftPointer);
            if (indexOfLastVisitedChar != rightPointer) {
                leftPointer = indexOfLastVisitedChar + 1;
            }
            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
        }
        return maxLength;
    }
}

///Input: s = "abcabcbb"
/// Output: 3
/// Explanation: The answer is "abc", with the length of 3
