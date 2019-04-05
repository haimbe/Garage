import java.util.ArrayList;

public class Vehicule  {

    Double prix;
    String nom;
    ArrayList <Option>;
    Marque marque;

    void class getMarque();
    void class getOptions();

    void class addOption(Option);
    void class toString();
    void class setMoteur(Moteur);

    public Double total(){
        double result=0.0;

        for(int i = 0; i < Option.size(); i++)
        {
           result +=Option.getPrix(i);
        }
        return result;
}
