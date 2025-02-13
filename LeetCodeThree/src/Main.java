import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = 0;
        // max = 3
        //Input: s = "abcabcbb"
        for (int right = 0, left = 0; right < s.length(); right++){
            int indexOfFirstAppearanceCharInSubstring = s.indexOf(s.charAt(right), left);
            if (indexOfFirstAppearanceCharInSubstring != right){
                left = indexOfFirstAppearanceCharInSubstring + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }
}
