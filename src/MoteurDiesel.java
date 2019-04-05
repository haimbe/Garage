public class MoteurDiesel extends Moteur{

     void MoteurDiesel(){

        puissance = "default";
        prix = 0;
        this.typeMoteur=TypeMoteur.DIESEL;

        void MoteurDiesel(puissance , prix){

            this.puissance=puissance;
            this.prix=prix;

            }

         double getPrix(){
            return prix;
         }

        public String toString(){


            return "Moteur DIESEL "+puissance+"W"+" ("+prix+"€)");
        }


    }
}
