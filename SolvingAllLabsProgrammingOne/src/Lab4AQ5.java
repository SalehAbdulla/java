import java.util.Scanner;

public class Lab4AQ5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose an option to display the corresponding piece of information:");
        menu();
        int userChoice = scanner.nextInt();
        switch(userChoice) {
            case 1:
                System.out.println("Your choice was 1. The capital of Bahrain is Manama.");
                break;
            case 2:
                System.out.println("Your choice was 2. The population of Bahrain: 1,039,297.");
                break;
            case 3:
                System.out.println("Your choice was 3. Bahrain has two seasons: an extremely hot summer and a relatively mild winter.");
                break;
            case 4:
                System.out.println("Your choice was 4. Bahrain's GDP was 35.31 billion USD in 2017.");
                break;
            case 5:
                System.out.println("Your choice was 5. Bahrain is 765.3 square km.");
                break;
            default:
                System.out.println("You entered a wrong choice.");
        }
    }

    public static void menu() {
        System.out.println("""
                1.Capital of Bahrain
                2.Population of Bahrain
                3.Climate of Bahrain
                4.GDP of Bahrain
                5.Size of Bahrain (square km)""");
    }
}
