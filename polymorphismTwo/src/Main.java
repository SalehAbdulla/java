import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter the movie type: S for Science fiction, C for comedy & A for adventure, e for exit");
            String movieType = s.nextLine();

            if ("Ee".contains(movieType)){
                break;
            }

            System.out.println("Enter the movie title");
            String movieTitle = s.nextLine();

            Movie movie = Movie.getMovie(movieTitle, movieType);

            if (movie instanceof Adventure userMovie){
                userMovie.watchAdventure();
            } else if (movie instanceof Comedy userMovie) {
                userMovie.watchComedy();
            } else if (movie instanceof ScienceFiction userMovie) {
                userMovie.watchScienceFiction();
            }
        }
    }
}
