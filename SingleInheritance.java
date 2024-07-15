class Jiraya{
    String pupil;
    String ninjutsu;
    boolean isNaruto;
    boolean isPain;
    boolean isMinato;

    public void checkNinjaWar(boolean isNaruto, boolean isMinato, boolean isPain){
        if(isNaruto && isMinato && isPain){
            System.out.println("The 3rd great NinjaWar will happen, Minato is Reincarnated");
            System.out.println();
        }else if(isNaruto && isMinato && !isPain){
            System.out.println("Jinchiriki (9-tailed Fox) sealed inside Naruto, Last Moment of Minato adn Kushina");
            System.out.println();
        } else if(isNaruto && isPain && !isMinato) {
            System.out.println("Fight is going on b/w Naruto-Sage-mode and Pain, Jiraya Last moment");
            System.out.println();
        }else {
            System.out.println("An era of Hashirama & madara");
            System.out.println();
        }
    }

}

class Follower extends Jiraya {
    String become;

    public void getShinobi() {
        System.out.println("Shinobi: " + this.pupil);
        System.out.println("Become : " +this.become);
        System.out.println("Ninjutsu: "+this.ninjutsu);
        System.out.println();
    }


}

public class SingleInheritance {
    public static void main(String[] args) {
        Follower shinobi1 = new Follower(); //Child Class Object created only

        shinobi1.become = "Hokage"; //Child class DMaccess

        shinobi1.pupil = "Minato"; //This below all are DM of Parent class accessible by Child class-Object
        shinobi1.ninjutsu = "Flying Raijin jutsu"; //Cause of inheritance
        shinobi1.isMinato = true;
        shinobi1.isNaruto = true;
        shinobi1.isPain = true;

        shinobi1.getShinobi(); //Accesedsd Child Class Method

        shinobi1.checkNinjaWar(shinobi1.isNaruto, shinobi1.isMinato, shinobi1.isPain); //Accessed Parent class Method

        //Second Obj
        Follower shinobi2 = new Follower();

        shinobi2.pupil = " Naruto";

        shinobi2.become = "Hokage";
        shinobi2.ninjutsu = "Rasen-Shuriken";
        shinobi2.isNaruto = true;
        shinobi2.isMinato = false;
        shinobi2.isPain = true;

        shinobi2.getShinobi();

        shinobi2.checkNinjaWar(shinobi2.isNaruto, shinobi2.isMinato, shinobi2.isPain);
    }
}
