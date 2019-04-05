public class MoteurElectrique extends Moteur{

    void MoteurElectrique(){

        puissance = "default";
        prix=0;
        this.typeMoteur=TypeMoteur.ELECTRIQUE;

        void MoteurElectrique(puissance , prix){

                this.puissance=puissance;
                this.prix=prix;

            }

            double getPrix(){
                return prix;
            }



    }


}
