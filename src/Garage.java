import java.util.ArrayList;

public class Garage {

    ArrayList voiture = new ArrayList();

    public String toString(){

         for(int i = 0; i < voiture.size(); i++)

        {

            return voiture[i].TypeMoteur.toString() + "\n");

        }

        if(voiture.size() == 0)
            System.out.println("Garage Vide !)";


    };


    public void addVoiture(Vehicule vehicule){


        voiture.add(vehicule);
    } ;
}
