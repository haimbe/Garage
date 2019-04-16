public class Laguna extends Vehicule {

    public Laguna(){

        this.marque=Marque.Reno;
        this.nom="Laguna";
    }

    public String toString(){

        return "Voiture "+this.marque.toString()+" : Laguna ";
    }
}