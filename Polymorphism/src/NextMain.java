public class NextMain {
    public static void main(String[] args) {

        // Calling Adventure instance using factory method. Compile time type
        Movie movie = Movie.getMovie("A", "JawsOfDefeat");
        movie.watchMovie();

        // Calling adventure instance using casting. Compile time type
        Adventure jawsOfDefeatMovie = (Adventure) Movie.getMovie("A", "JawsOfDefeat");
        jawsOfDefeatMovie.watchMovie();

        // Compile time type
        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        // run time type
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        // run time type
        var plane = new Comedy("AirPlane");
        plane.watchComedy();

        var comedyMovieTwo = new Comedy("PK");
        comedyMovieTwo.watchMovie();

        Object unknownObject = Movie.getMovie("C", "PK 2");
        if (unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }






    }
}