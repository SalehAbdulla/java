public class Main {
    public static void main(String[] args) {

        String s = "abcdabcdf";
        StringBuilder currentString = new StringBuilder();
        int maxValue = 0;

        for (int i = 0; i < s.length(); i++){
            for (int j = i; j < s.length(); j++){
                if (currentString.indexOf(String.valueOf(s.charAt(j))) != -1){
                    break;
                }
                currentString.append(s.charAt(j));
            }
            maxValue = Math.max(currentString.length(), maxValue);
        }

        System.out.println(currentString);
        System.out.println(maxValue);
    }
}