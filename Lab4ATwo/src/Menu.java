import java.util.*;

public class Menu {
    public static void main(String[] args) {
        String menu = """
                Choose an option to display the corresponding piece of information:
                1.Capital of Bahrain
                2.Population of Bahrain
                3.Climate of Bahrain
                4.GDP of Bahrain
                5.Size of Bahrain (square km)""";

        System.out.println(menu);
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput == 1) System.out.println("Your choice was 1. The capital of Bahrain is Manama.");
        else if (userInput == 2) System.out.println("Your choice was 2. The population of Bahrain: 1,039,297.");
        else if (userInput == 3) System.out.println("Your choice was 3. Bahrain has two seasons: an extremely hot summer and a relatively mild winter.");
        else if (userInput == 4) System.out.println("Your choice was 4. Bahrain's GDP was 35.31 billion USD in 2017.");
        else if (userInput == 5) System.out.println("Your choice was 5. Bahrain is 765.3 square km.");
        else System.out.println("You entered a wrong choice.");

    }

}
