public class Main {
    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));

        String s = "abcdabcd";

        for (int i = 0; i < s.length(); i++){

            System.out.println(i + "i");
            for (int j = i; j < s.length(); j++){
                System.out.println(j + "j");

            }

        }

    }
}