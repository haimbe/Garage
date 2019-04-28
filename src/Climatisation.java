public class Climatisation implements Option{
    double prix = 347.3;
    String nom = "Climatisation";


    public double getPrix()

    {
        return prix;}

        public String toString () {
        return nom + getPrix();
    }


}