public class Main {
    public static void main(String[] args) {
        printFactors(10);
    }

    public static void printFactors(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int temp = 1;

        while (number > 0 && temp <= number) {
            if (number %temp == 0){
                System.out.println(temp);
            }
            temp += 1;
        }
    }
}