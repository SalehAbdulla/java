public class Movie {
    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        System.out.println(title + " is a " + this.getClass().getSimpleName() + " film.");
    }
    // Factory method in software programming design patterns
    public static Movie getMovie(String movieType, String title){

        return switch (movieType.toUpperCase().charAt(0)) {
            case ('S') -> new ScienceFiction(title);
            case ('A') -> new Adventure(title);
            case ('C') -> new Comedy(title);
            default -> new Movie(title);
        };
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
                "Something more Adventure happens",
                "Adventure ends");
    }

    public void watchAdventure(){
        System.out.println("Watching an Adventure");
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
                "Something Comedy happens",
                "Something more Comedy happens",
                "Comedy ends");
    }

    public void watchComedy(){
        System.out.println("Watching an Comedy");
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
                "Something more ScienceFiction happens",
                "ScienceFiction ends");
    }

    public void watchScienceFiction(){
        System.out.println("Watching an ScienceFiction");
    }
}