public class Vitreelectrique implements Option {
    double prix = 252.35;
    String nom = "Vitre électrique";


    public double getPrix()

    {
        return prix;}

        public String toString () {
        return nom + getPrix();
    }


}