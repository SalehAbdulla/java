import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter Movie type: C for Comedy, A for Adventure, S for Science Fiction or e for Exit: ");
            String type = s.nextLine();
            if ("eE".contains(type)){
                break;
            }
            System.out.println("Enter movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }

}