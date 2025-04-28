package dev.lpa;

public class LongestSubString {

    public static int longestSubString(String s){
        int maxLength = 0;

        for (int leftSlide = 0, rightSlide = 0; rightSlide < s.length(); rightSlide++) {

            int indexOfLastVisitedCharacter = s.indexOf(s.charAt(rightSlide), leftSlide);

            if (indexOfLastVisitedCharacter != rightSlide) {
                leftSlide++;
                maxLength = Math.max(maxLength, rightSlide - leftSlide + 1);

            }

        }

        return maxLength;
    }


}


//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.