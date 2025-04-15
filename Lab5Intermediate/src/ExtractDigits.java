public class ExtractDigits {
    public static void main(String[] args) {
        System.out.println(extractDigits("IT6008"));  // Output: 6008
    }

    private static String extractDigits(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }
}
