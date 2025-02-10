public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("C", "PK");
        movie.watchMovie();


        Comedy pk = (Comedy) Movie.getMovie("C", "PK");
        pk.watchMovie();

        Object adventure = Movie.getMovie("A", "Adventure");
        Adventure adventureMovie = (Adventure) adventure;
        adventureMovie.watchAdventure();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();


        var plane = new Comedy("airplane");
        plane.watchComedy();

    }
}