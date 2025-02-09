class SolutionOne {
    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++){
            // StringBuilder inside the outer loop to reset the StringBuilder in each starting index i
            StringBuilder currentString = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                // if not -1 then it's exist, else -1 then add it.
                if (currentString.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                } else {
                    currentString.append(s.charAt(j));
                    maxLength = Math.max(maxLength, currentString.length());
                }
            }
        }
        return maxLength;
    }
}
