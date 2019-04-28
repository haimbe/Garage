public class Barredetoit implements Option{
    double prix = 29.9;
    String nom = "Barre de toit";



    public double getPrix()

    {
        return prix;}

        public String toString () {
        return nom + getPrix();
    }


}