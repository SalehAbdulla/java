public class SolutionTwo {


    public static int longestSubString(String s){

        int maxLength = 0;

        // Input: s = "abcabcbb"
        for (int leftPointer = 0, rightPointer = 0; rightPointer < s.length(); rightPointer++){
            int indexOfLastVisitedChar = s.indexOf(s.charAt(rightPointer), leftPointer);
            if (indexOfLastVisitedChar != rightPointer){
                leftPointer = indexOfLastVisitedChar + 1;
                maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
            }
        }

        return maxLength;
    }
}
