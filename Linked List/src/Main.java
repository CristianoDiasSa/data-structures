import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        int [] array = {3,32,5,354,139,2345,113, 1325};
        Movies movie1 = new Movies("Pirates of the caribbean", "Veri goodi movie", "Comedy", 125, 5);
        Movies movie2 = new Movies("The Conjuring", "Goodi movie", "Horror", 125, 5);
        Movies movie3 = new Movies("The Conjuring 2", "Not that good", "Horror", 115, 4);
        Movies movie4 = new Movies("Big Stan", "Goodi movie", "Comedy", 80, 4);
        Movies movie5 = new Movies("Tom Cruise Movie", "Tom Cruise movie like the others", "Action", 115, 4);


        LinkedListMovies myList = new LinkedListMovies();
        myList.add(movie1);
        myList.add(movie2);
        myList.add(movie3);
        myList.add(movie4);
        myList.add(movie5);

        //System.out.println(myList.genreSearch("Horror"));
        //System.out.println(myList.averageRating());
        //myList.remove("Pirates the caribbean");
        //System.out.println(myList.toString());
        //System.out.println(myList.isEmpty());
        //System.out.println(myList.last);

        IterativeAndRecursive iAndR = new IterativeAndRecursive();
        iAndR.iterativeChecking(array);
        System.out.println("\nRecursive Method!");
        iAndR.recursiveChecking(array, 0);


    }
}