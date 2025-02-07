class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++){
            StringBuilder currentSubString = new StringBuilder();
            for (int j = 0; j < s.length(); j++){
                if (currentSubString.indexOf(String.valueOf(s.charAt(j))) != -1){
                    break;
                }
                currentSubString.append(s.charAt(j));
                maxLength = Math.max(currentSubString.length(), maxLength);
            }
        }
        return maxLength;
    }
}
