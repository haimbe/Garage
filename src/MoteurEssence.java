public class MoteurEssence extends Moteur{




       void MoteurEssence(String puissance , double prix){

           this.puissance=puissance;
           this.prix=prix;
           this.typeMoteur=TypeMoteur.ESSENCE;

       }

    public String toString(){

        return "Moteur "+ this.typeMoteur.toString() + " "+ this.puissance+ " Chevaux " + "("+this.prix+")"+" ";
    }


    }

