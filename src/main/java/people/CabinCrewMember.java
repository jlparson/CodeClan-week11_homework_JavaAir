package people;

public class CabinCrewMember extends Person{

    private PersonRank personRank;

    public CabinCrewMember(String name, PersonRank personRank) {
        super(name);
        this.personRank = personRank;
    }

    public String getName() {
        return name;
    }

    public PersonRank getRank(){
        return personRank;
    }

    public String relayMessageToPassengers() {
        return "Passengers, can I have your attention please...";
    }
}
