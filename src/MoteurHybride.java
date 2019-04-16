public class MoteurHybride extends Moteur{

    void MoteurHybride(){

        prix = 28457;
        this.typeMoteur=TypeMoteur.HYBRID;

    }

    public String toString(){

        return "Moteur "+ this.typeMoteur.toString() + " "+ "("+this.prix+")"+" ";
    }
}
