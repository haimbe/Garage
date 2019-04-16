import java.util.ArrayList;

public class Vehicule {

    Double prix;
    String nom;
    ArrayList<Option> options;
    Marque marque;
    Moteur moteur;

    public Marque getMarque() {
        return this.marque;
    }


    public void ArrayList Option getOption() {
        return <this.options> ;
    }


    public void addOption(Option option) {

        this.options.add(option);}



    public String toString(){
        return this.nom.toString()+this.moteur.toString();}



    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }


    public double getPrix() {
        double result = 0.0;

        for (int i = 0; i < options.size(); i++) {
            result += options.get(i).getPrix();
        }
        return result + this.moteur.getPrix();
    }
}
