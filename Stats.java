public class Stats {
    private String name;
    private int lifeSpan;

    private int rank;
    private String Aptitude;


    public Stats() {
        name=null;
      Aptitude=null;
        lifeSpan = 100;
        rank = 0;

    }

    public void printStats() {
        System.out.println("---Stats---\nName: "+name+"\nCultivation rank: "+rank+"\nAptitude: "+Aptitude+"\nLifespan: "+lifeSpan);
    }
public void ChangeAptitude(String aptitude){
        Aptitude=aptitude;
}
public void ChangeName(String Name){
        name=Name;
}
}
