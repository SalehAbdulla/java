import java.util.HashMap;
import java.util.Map;

public class SolutionTwo {

    public static int lengthOfLongestSubstring(String s){
        int maxLength = 0;
        Map<Character, Integer> visitedChar = new HashMap<>();
        for (int right = 0, left = 0; right < s.length(); right++){
            Character currentChar = s.charAt(right);
            if (visitedChar.containsKey(currentChar) && visitedChar.get(currentChar) >= left) {
                left = visitedChar.get(currentChar) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            visitedChar.put(currentChar, right);
        }
        return maxLength;
    }
}
