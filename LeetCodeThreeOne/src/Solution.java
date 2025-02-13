import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int lengthOfLongestSubstring(String s){
                                            // s = "abcabcbb"
        Map<Character, Integer> visitedChar = new HashMap<>();
        int maxLength = 0;

        for (int right = 0,left = 0; right < s.length(); right++){

            if (visitedChar.containsKey(s.charAt(right)) && visitedChar.get(s.charAt(right)) >= left){
                left = visitedChar.get(s.charAt(right)) + 1;
                maxLength = Math.max(maxLength, right - left + 1);
            }

            visitedChar.put(s.charAt(right), right);
        }

        return maxLength;
    }
}
