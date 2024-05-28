import java.util.Scanner;

public class Main {

    static String aptitude="";
    static String Name="";
    Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
new Main();
    }
    public Main(){
        Stats();
    }
    public void Stats(){
        int active=1;

        if(active==1) {
            int generator = (int) (Math.random() * 101);
            if (generator >= 0 && generator <= 3) {
                int extremeNum=(int) (Math.random() * 10);
                if(extremeNum==0 ){

                    aptitude="Verdant Great Sun Physique";
                }
                if(extremeNum==1 ){
                    aptitude="Desolate Ancient Moon Physique";
                }
                if(extremeNum==2 ){
                    aptitude="Northern Dark Ice Soul Physique";
                }
                if(extremeNum==3 ){
                    aptitude="Boundless Forest Samsara Physique";
                }
                if(extremeNum==4 ){
                    aptitude="Blazing Glory Lightning Brilliance Physique";
                }
                if(extremeNum==5 ){
                    aptitude="Myriad Gold Wondrous Essence Physique";
                }
                if(extremeNum==6 ){
                    aptitude="Great Strength True Martial Physique";
                }
                if(extremeNum==7 ){
                    aptitude="Carefree Wisdom Heart Physique";
                }
                if(extremeNum==8 ){
                    aptitude="Thick Earth Center Origin Physique";
                }
                if(extremeNum==9 ){
                    aptitude="Cosmic Great Derivation Physique";
                }


            } else if (generator >= 0 && generator <= 10) {
                aptitude="A";
            } else if (generator >= 0 && generator <= 15) {
                aptitude="B";
            } else if (generator <= 25) {
                aptitude="C";
            } else {
                aptitude="D";
            }
        }
        System.out.println("Opening\n" +
                "Well you're dead whether by car crash, disease, food poisoning, homicide, suicide, In sleep and more reasons it does not matter \nfor you are given one more chance to life or rather you where forced to as just as you died your soul was pulled towards another world \nyour new fate unknown.\n");
        System.out.println("Insert name");
         Name=scan.next();
         Stats chart=new Stats();
         chart.ChangeName(Name);
         chart.ChangeAptitude(aptitude);
        System.out.println("As you give your name whether real or not a status appears in front of you representing your being.");
        System.out.println("\n Insert 1 to continue to stats");
        String cont=scan.next();

        chart.printStats();
        System.out.println("\nInsert 1 to continue or if not If not satisfied. \nInsert 2 to reroll you have 5 retries. ");
        int roll=scan.nextInt();
        if(roll==2){
            chart.printStats();
            System.out.println("\nInsert 1 to continue or if not If not satisfied. \nInsert 2 to reroll you have 4 retries. ");


        }
        System.out.println("I few breaths of time pass before truly begins as your soul seeks a body to reside.");



    }
}
