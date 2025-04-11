public class Main {
    public static void main(String[] args) {
        System.out.println(XOnEitherSides("Lexus"));
    }

    public static boolean XOnEitherSides(String text) {
        //Write your code here
        boolean hasChar = false;

        if (Character.toLowerCase(text.charAt(0)) == 'x' || Character.toLowerCase(text.charAt(text.length() - 1))  == 'x'){
            hasChar = true;
        }

        //End of your code
        return hasChar;
    }

}