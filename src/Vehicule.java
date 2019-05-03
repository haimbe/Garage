import java.util.ArrayList;

public class Vehicule {

    Double prix;
    String nom;
    ArrayList<Option> options = new ArrayList<>();
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

    public double getPrix() {
        double result = 0.0;

        for (int i = 0; i < options.size(); i++) {
            result += options.get(i).getPrix();
        }
        return result + this.moteur.getPrix();
    }



    public String toString(){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < options.size(); i++) {
            sb.append(options.get(i).toString()+" ");}
        return this.nom+" "+this.marque+" "+this.moteur.toString()+sb.toString()+" prix total = "+this.getPrix();}



    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }



}
