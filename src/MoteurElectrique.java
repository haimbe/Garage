public class MoteurElectrique extends Moteur{

    void MoteurElectrique(){

        puissance = "default";
        prix=0;

     public String toString(){

          return "Moteur ELECTRIQUE "+puissance+"W"+" ("+prix+"€)");
        }

    }


}
