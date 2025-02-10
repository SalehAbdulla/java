public class SolutionOne {
    //                   s = abcabcbb
    public static int longestSubstring(String s){
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++){
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = i; j < s.length(); j++){
                // if -1 then doesn't exist, otherwise it exist.
                if (stringBuilder.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                } else {
                    stringBuilder.append(s.charAt(j));
                    maxLength = Math.max(maxLength, stringBuilder.length());
                }
                System.out.println(stringBuilder);
            }
        }
        return maxLength;
    }

}
