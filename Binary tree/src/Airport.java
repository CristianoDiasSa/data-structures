/*
 * Project.java
 * @author Cristiano
 * 20/08/2022
 */


public class Airport implements Comparable<Airport>{
    private String name;
    private String location;
    private int airportWaitingIndex;

    //Create the constructor
    public Airport(String name, String location, int airportWaitingIndex)
    {
        this.name = name;
        this.location = location;
        this.airportWaitingIndex = airportWaitingIndex;
    }

    // We would like to compare two food products using the healthIndex
    public int compareTo(Airport o) {
        if(this.airportWaitingIndex == o.airportWaitingIndex)
        {return 0;
        } else if(this.airportWaitingIndex > o.airportWaitingIndex)
        {
            return 1;
        } else
        {
            return -1;
        }
    }

    @Override
    public String toString(){
        return "Airport = "+name+"\nLocation = " + location + "\nWaiting Index = "+ airportWaitingIndex +" ";
    }

    //The accessor methods give us access to instance variables...
    public String getName()
    { return name;
    }

    public String getLocation(){
        return location;
    }
    public int airportWaitingIndex(){
        return airportWaitingIndex;
    }

    public static void main(String[] args) {
        Airport airport = new Airport("Dublin Airport", "Ireland", 10);
        System.out.println(airport);
    }

}

