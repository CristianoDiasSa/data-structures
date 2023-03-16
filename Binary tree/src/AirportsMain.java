/*
 * Project.java
 * @author Cristiano
 * 20/08/2022
 */

public class AirportsMain extends BinaryTreeBaseCode<Airport>{
    public static void main(String[] args) {
        AirportsMain airports = new AirportsMain();


        // Testing the isEmpty() method and expecting it to be true!
        System.out.println("Firstly, we will check if the tree is currently empty!");
        System.out.println(airports.isEmpty());
        System.out.println("--------------------------------------------------------");

        // Adding some objects so we can test our methods
        airports.insert(new Airport("Dublin Airport", "Ireland", 6));
        airports.insert(new Airport("Cork Airport", "Ireland", 5));
        airports.insert(new Airport("Galway Airport", "Ireland", 9));
        airports.insert(new Airport("Frankfurt Airport", "Germany", 10));
        airports.insert(new Airport("Galeao Airport", "Brazil", 4));
        airports.insert(new Airport("Guarulhos Airport", "Brazil", 2));
        airports.insert(new Airport("London Airport", "The United Kingdom", 7));
        airports.insert(new Airport("New York Airport", "The United States", 3));
        airports.insert(new Airport("Vancouver Airport", "Canada", 1));
        airports.insert(new Airport("Toronto Airport", "Canada", 8));


        System.out.println("Airports were all added already!");
        System.out.println("--------------------------------------------------------");

        // Testing the isEmpty() method and expecting it to be false!
        System.out.println("Now we will check if the tree is empty again just to be sure!");
        System.out.println(airports.isEmpty());
        System.out.println("--------------------------------------------------------");

        // Testing the findBest() method
        System.out.println("The best airport by waiting time index is is : \n" +airports.findBest());
        System.out.println("--------------------------------------------------------");

        // Testing the findWorst() method
        System.out.println("The worst airport by waiting time index is is : \n" +airports.findWorst());
        System.out.println("--------------------------------------------------------");

        // Testing the size() method
        System.out.println("The size of the tree is : " +airports.size());
    }

}
