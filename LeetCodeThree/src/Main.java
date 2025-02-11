import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int solution = lengthOfLongestSubstring("abcabcbb");
        System.out.println(solution);
    }

    // Input: s = "abcabcbb"

    public static int lengthOfLongestSubstring(String s){

        int maxLength = 0;
        Map<Character, Integer> visitedChar = new HashMap<>();

        for (int rightPointer = 0, leftPointer = 0; rightPointer < s.length(); rightPointer++){
            char currentChar = s.charAt(rightPointer);
            if (visitedChar.containsKey(currentChar) && visitedChar.get(currentChar) >= leftPointer) {
                // This means we have a repeated character within the substring range.
                leftPointer = visitedChar.get(currentChar) + 1;
            };

            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
            visitedChar.put(currentChar, rightPointer);
        }
        return maxLength;
    }
}
