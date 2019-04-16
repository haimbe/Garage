public class A300B extends Vehicule{

    public A300B(){

        this.marque=Marque.PIGEOT;
        this.nom="A300B";
    }
    public String toString(){

        return "Voiture "+this.marque.toString()+" : A300B ";
    }
}