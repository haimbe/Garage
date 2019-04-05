public class MoteurEssence extends Moteur{

    String puissance;
    Double prix;

   void MoteurEssence(){

        puissance ="default";
        prix = 0.0;
       this.typeMoteur=TypeMoteur.ESSENCE;}

       void MoteurEssence(puissance , prix){

           this.puissance=puissance;
           this.prix=prix;

       }

       double getPrix(){
           return prix;
       }


    }
}
