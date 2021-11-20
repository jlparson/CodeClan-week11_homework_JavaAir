package people;

public class Pilot extends Person{

    private PersonRank personRank;
    private String pilotLicence;

    public Pilot(String name, PersonRank personRank, String pilotLicence){
        super(name);
        this.personRank = personRank;
        this.pilotLicence = pilotLicence;
    }

    public String getName(){
        return name;
    }

    public PersonRank getPersonRank() {
        return personRank;
    }

    public String getPilotLicence() {
        return pilotLicence;
    }

    public String flyPlane(){
        return "I'm flying a plane!!!";
    }

}
