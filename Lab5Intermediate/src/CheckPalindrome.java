public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(""));
    }

    public static boolean checkPalindrome(String word){
        if (word.isEmpty()) return true;
        char firstChar = Character.toLowerCase(word.charAt(0));
        char lastChar = Character.toLowerCase(word.charAt(word.length() - 1));
        return firstChar == lastChar;

    }
}
