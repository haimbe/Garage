public class MoteurHybride extends Moteur{

    public MoteurHybride(String puissance , double prix){

        this.puissance=puissance;
        this.prix = prix;
        this.typeMoteur=TypeMoteur.HYBRID;

    }

    public String toString(){

        return "Moteur "+ this.typeMoteur.toString() + " "+ "("+this.prix+")"+" ";
    }
}


