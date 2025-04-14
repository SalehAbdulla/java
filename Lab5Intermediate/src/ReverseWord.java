public class ReverseWord {
    public static void main(String[] args) {
        //Write a JAVA program that accepts a string as input and then prints it out in reverse.
        //reverse("ABC");
        //CBA

        reverse("ABC");

    }

    private static void reverse(String word) {
        int wordCounter = word.length();
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(wordCounter - 1));
            wordCounter--;
        }
    }
}
