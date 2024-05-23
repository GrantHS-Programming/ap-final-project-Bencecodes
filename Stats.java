public class Stats {
    private String name;
    private int lifeSpan;

    private int rank;
    private String Aptitude;


    public Stats(String name,String Aptitude) {
        this.name = name;
        this.Aptitude=Aptitude;
        lifeSpan = 100;
        rank = 0;

    }

    public String printStats() {
       return "---Stats---\nName: "+name+"\nCultivation rank: "+rank+"\nAptitude: "+Aptitude+"\nLifespan: "+lifeSpan;
    }

}
