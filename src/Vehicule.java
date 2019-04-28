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


    public ArrayList <Option> getoptions() {
        return this.options ;
    }


    public void addOption(Option option) {

        this.options.add(option);}



    public String toString(){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < options.size(); i++) {
            sb.append(options.get(i).toString());}
        return this.nom+this.moteur.toString()+sb.toString();}



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
