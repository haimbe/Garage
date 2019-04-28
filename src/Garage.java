import java.util.ArrayList;

public class Garage {

    ArrayList voitures = new ArrayList();


    public String toString() {

    if(voitures.size() == 0){
            return "Garage Vide !";}

    else

    {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < voitures.size(); i++) {
            sb.append(voitures.get(i).toString());}

            return sb.toString();
        }


    }


    public void addVoiture(Vehicule vehicule){


        voitures.add(vehicule);
    } ;
}
