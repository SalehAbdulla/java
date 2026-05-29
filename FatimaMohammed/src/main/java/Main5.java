public class Main5 {
    public static void main(String[] args) {
        int[] a = new int[10]; // [0,0,0,0,0,0,0,0,0]

        for (int i = a.length -1; i >= 0; i -= 2) {
            a[i] += i;
            System.out.println(a[i]);
        }
    }


    public static void searchHighest() {
        String[] students = {"John","Maryam","Fatema","Paul","Zainab", "Mary", "Ahmed","Peter", "Hussain","Sayed Hussain"};
        double[] grades = { 52.4,67.9,87.3,45.2,77.8,93.6,83.9,62.7,68.9,78.2 };

        double high = 0; // flag
        int location = 0; // flag

        for (int i = 0; i < grades.length; i++){
            if (grades[i] > high) {
                high = grades[i];
                location = i;
            }
        }

        System.out.println(high);
    }
}
