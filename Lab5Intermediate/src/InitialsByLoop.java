public class InitialsByLoop {
    public static char firstInitial;
    public static char secondInitial;

    public static void main(String[] args) {
        //write a method that uses a loop to return the initials of a name passed by parameter in the format ("I.I.")
        System.out.println(initials("Imam Imam"));
    }

    public static String initials(String name) {
                                // Imam Imam

        for (int i = 0; i < name.length(); i++){
            if (i == 0) firstInitial = name.charAt(i);
            if (i == name.indexOf(" ")) secondInitial = name.charAt(i + 1);
        }

        return String.format("%c.%c.", firstInitial, secondInitial);
    }
}
