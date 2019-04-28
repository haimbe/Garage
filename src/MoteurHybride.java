public class MoteurHybride extends Moteur{

    public void MoteurHybride(){

        prix = 28457;
        this.typeMoteur=TypeMoteur.HYBRID;

    }

    public String toString(){

        return "Moteur "+ this.typeMoteur.toString() + " "+ "("+this.prix+")"+" ";
    }
}
