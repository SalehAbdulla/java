public class Main {
    public static void main (String[] args){
        printConversion(95.75);
        printMegaBytesAndKiloBytes(2500);
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double result =  kilometersPerHour / 1.609;
            return Math.round(result);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " and " + (kiloBytes % 1024) + "KB");
    }

}
