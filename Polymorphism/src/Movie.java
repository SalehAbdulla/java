public class Movie {
    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        // return class name
        System.out.println(title + " is a " + this.getClass().getSimpleName() + " film.");
    }

    public static Movie getMovie(String movieType, String title){
        return switch (movieType.toUpperCase().charAt(0)) {

            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            case 'A' -> new Adventure(title);
            default -> new Movie(title);

        };
    }
}


class Comedy extends Movie {

    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something happy happens",
                "Something even more happier happens",
                "Happy ends");
    }
}

class Adventure extends Movie {

    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something Adventure happens",
                "Something even more Adventure happens",
                "Adventure ends");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something ScienceFiction happens",
                "Something even more ScienceFiction happens",
                "ScienceFiction ends");
    }
}

