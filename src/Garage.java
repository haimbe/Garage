import java.util.ArrayList;

public class Garage {

    ArrayList voiture = new ArrayList();

    public String toString(){

         for(int i = 0; i < voiture.size(); i++)

        {

            System.out.println(i + "\n");

        }

        if(voiture.size() < 1)
            System.out.println("Garage Vide !)";


    }

    String nom;

    void addVoiture(String nom){

        this.nom = nom;

        voiture.add(nom);
    } ;
}
