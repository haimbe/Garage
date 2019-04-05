import java.util.ArrayList;

public class Garage {

    ArrayList voiture = new ArrayList();

    static void garageAppend() {
        StringBuilder sb = new StringBuilder();
        sb.append("Voiture Marque ");
        sb.append(this.getMarque());
        sb.append(this.typeMoteur);
        for (int i = 0; i < voiture.size(); i++) {
            String str;
            str = +=Option.get(i).toString;
            sb.append(str);
            }
        sb.append(this.result);
        return(sb);

    }

            if(voiture.size() == 0)
            System.out.println("Garage Vide !)";





    public void addVoiture(Vehicule vehicule){


        voiture.add(vehicule);
    } ;
}
