package dev.lpa;

import java.time.OffsetDateTime;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int longestSubString = longestSubStringWithoutRepeating(s);
        System.out.println(longestSubString);
    }


    public static int longestSubStringWithoutRepeating(String s) {
        //Input: s = "abcabcbb"
        int maxCounted = 0;

        for (int leftPointer = 0, rightPointer = 0; rightPointer < s.length(); rightPointer++) {

            Integer indexOfLastVisitedChar = s.indexOf(s.charAt(rightPointer),leftPointer);

            if (indexOfLastVisitedChar != rightPointer) {
                leftPointer = indexOfLastVisitedChar + 1;
            }

            maxCounted = Math.max(maxCounted, rightPointer - leftPointer + 1);
        }

        return maxCounted;

    }

}


//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
