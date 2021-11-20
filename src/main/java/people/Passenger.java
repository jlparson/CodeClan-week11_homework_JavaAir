package people;

public class Passenger extends Person {

    private int numOfBags;

    public Passenger(String name, int numOfBags){
        super(name);
        this.numOfBags = numOfBags;
    }

    public int getNumberOfBags(){ return numOfBags; }
}
