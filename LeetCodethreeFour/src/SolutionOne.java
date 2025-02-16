import java.util.HashMap;
import java.util.Map;

public class SolutionOne {
    // Input: s = "abcabcbb"
    public static int longestSubString(String s){
        Map<Character, Integer> indexOfChar = new HashMap<>();
        int maxLength = 0;
        for (int leftPointer = 0, rightPointer = 0; rightPointer < s.length(); rightPointer++){
            if (indexOfChar.containsKey(s.charAt(rightPointer)) && indexOfChar.get(s.charAt(rightPointer)) >= leftPointer){
                leftPointer++;
                maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
            }
            indexOfChar.put(s.charAt(rightPointer), rightPointer);
        }
        return maxLength;
    }
}
