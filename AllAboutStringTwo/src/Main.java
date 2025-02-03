public class Main {
    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");

        System.out.println("StartingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        System.out.println("Month = " + birthDate.substring(3, 5));
        System.out.println("Day = " + birthDate.substring(0, 2));

        String newDate = String.join("/", "25", "11", "1928");
        System.out.println("New Date = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("New Date = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("New Date = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("New Date = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(5));
        System.out.println("-".repeat(100));

        System.out.println("ABC\n".repeat(5).indent(8));
        System.out.println("-".repeat(100));

        System.out.println("    ABC\n".repeat(5).indent(-2));
        System.out.println("-".repeat(100));


        
    }
}