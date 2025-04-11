import java.util.*;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int userAge = scanner.nextInt();

        if (userAge < 21){
            System.out.println("It's wonderful to be young only with strong mentality");
        } else {
            System.out.println("Age is a state of mind!");
        }


    }

}
