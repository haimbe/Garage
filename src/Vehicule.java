import java.util.ArrayList;

public class Vehicule  {

    Double prix;
    String nom;
    ArrayList <Option>;
    Marque marque;

    void class getMarque(Marque);
    void class getOptions();

    double class getPrix(){
       return Moteur.getPrix()+Option.getPrix()
    };

    void class addOption(Option);
    void class toString();
    void class setMoteur(Moteur);
}
