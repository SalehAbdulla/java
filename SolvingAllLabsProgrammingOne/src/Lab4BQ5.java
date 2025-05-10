public class Lab4BQ5 {
    public static void main(String[] args) {
        System.out.println(XOnEitherSides("Xabi Alonso"));
        System.out.println(XOnEitherSides("x-treme"));
        System.out.println(XOnEitherSides(""));
    }

    public static boolean XOnEitherSides(String text){
        if (text.isEmpty()) {
            return false;
        }
        boolean isXOnEitherSide = false;
        if (Character.toLowerCase(text.charAt(0)) == 'x' || Character.toLowerCase(text.charAt(text.length() - 1)) == 'x') {
            isXOnEitherSide = true;
        }
        return isXOnEitherSide;
    }
}
