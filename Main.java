public class Main {

    static String Aptitude="";
    public static void main(String[] args) {
        int active=1;

        while(active==1) {
            int generator = (int) (Math.random() * 101);
            if (generator >= 0 && generator <= 3) {
                int extremeNum=(int) (Math.random() * 10);
                if(extremeNum==0 ){

                    Aptitude="Verdant Great Sun Physique";
                }
                if(extremeNum==1 ){
                    System.out.println("Desolate Ancient Moon Physique");
                }
                if(extremeNum==2 ){
                    System.out.println("Northern Dark Ice Soul Physique");
                }
                if(extremeNum==3 ){
                    System.out.println("Boundless Forest Samsara Physique");
                }
                if(extremeNum==4 ){
                    System.out.println("Blazing Glory Lightning Brilliance Physique");
                }
                if(extremeNum==5 ){
                    System.out.println("Myriad Gold Wondrous Essence Physique");
                }
                if(extremeNum==6 ){
                    System.out.println("Great Strength True Martial Physique");
                }
                if(extremeNum==7 ){
                    System.out.println("Carefree Wisdom Heart Physique");
                }
                if(extremeNum==8 ){
                    System.out.println("Thick Earth Center Origin Physique");
                }
                if(extremeNum==9 ){
                    System.out.println("Cosmic Great Derivation Physique");
                }


            } else if (generator >= 0 && generator <= 10) {
                System.out.println("A");
            } else if (generator >= 0 && generator <= 15) {
                System.out.println("B");
            } else if (generator <= 25) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }
    }
}
