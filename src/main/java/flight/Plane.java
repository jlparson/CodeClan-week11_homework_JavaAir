package flight;

public enum Plane {

    BOEING747(366, 412770),
    BOEING777(350, 247200),
    BOEING787(248, 227930);

    private final int capacity;
    private final int weight;

    Plane(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){ return capacity; }
    public int getWeight(){ return weight; }
}
