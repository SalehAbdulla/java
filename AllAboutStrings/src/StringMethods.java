public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");

        System.out.println("startingIndex of 1982 = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));


        System.out.println("Month = " + birthDate.substring(3, 5));


        String newDateUsingJoin = String.join("/", "03", "12", "1998");
        System.out.println("New Date: " + newDateUsingJoin);


        String newDate = "35";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2025");

        System.out.println(newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        newDate = "25".concat("/").concat("11").concat("/").concat("1998");
        System.out.println("new Date = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("-".repeat(20));
        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));


    }
}
