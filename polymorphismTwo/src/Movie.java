public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        System.out.println(title + " is a " + this.getClass().getSimpleName());
    }

    // Instance Factory
    public static Movie getMovie(String title, String type){
        return switch (type.toUpperCase().charAt(0)) {
            case 'C' -> new Comedy(title);
            case 'A' -> new Adventure(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
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

    public void watchAdventure(){
        System.out.println("Watch ... An Adventure Movie");
    }
}


class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something Comedy happens",
                "Something even more Comedy happens",
                "Comedy ends");
    }

    public void watchComedy(){
        System.out.println("Watch ... a Comedy Movie");
    }
}

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
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

    public void watchScienceFiction(){
        System.out.println("Watch ... a ScienceFiction Movie");
    }

}
