import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter the movie type " +
                    "('C' for comedy, 'A' for adventure, 'S' for Science Fiction, E for exit ) : ");

            String movieType = s.nextLine();
            if ("Ee".contains(movieType)){
                break;
            }

            System.out.println("Enter the title of the movie: ");
            String movieTitle = s.nextLine();

            Movie theMovie = Movie.getMovie(movieType, movieTitle);
            theMovie.watchMovie();

        }

    }
}