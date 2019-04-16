abstract class Moteur {

    TypeMoteur typeMoteur;
    String puissance;
    double prix;
    public double getPrix(){
        return prix;
    };

    public String toString(){
        return this.typeMoteur.toString();
    }






}
