public class Movies {
    public String movieTitle, genre, description;
    public int duration, rating;

    public Movies(String movieTitle, String genre, String description, int duration, int rating) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.description = description;
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public String toString() {
        String output = "Movie Details\n";
        output += "Movie Title : " + movieTitle + "\n";
        output += "Description : " + description + "\n";
        output += "Genre       : " + genre + "\n";
        output += "Duration    : " + duration + "\n";
        output += "Rating      : " + rating + "\n";
        return output;
    }


    public static void main(String[] args) {
        Movies Movies = new Movies("Pirates of the caribbean","Veri goodi movie" , "Comedy", 125, 5);
        System.out.println(Movies);
    }
}

