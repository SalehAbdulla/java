public class Main {
    public static void main (String[] args) {
        System.out.println(BarkingDog(true, -1));
    }

    public static boolean BarkingDog (boolean barking, int hourOfDay) {
        if ((hourOfDay > -1 && hourOfDay < 24) && (barking) ) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }
        }
        return false;
    }
}