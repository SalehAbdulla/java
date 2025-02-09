import java.util.HashMap;
import java.util.Map;

class SolutionTwo {

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        Map<Character, Integer> visitedChars = new HashMap<>();

        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            // we only will change the left-pointer if we have encounter a repeated character.
            if (visitedChars.containsKey(currentChar) && visitedChars.get(currentChar) >= left){
                left = visitedChars.get(currentChar) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            visitedChars.put(currentChar, right);
        }

        return maxLength;
    }
}