public class Siegechauffant implements Option{
    double prix = 562.9;
    String nom = "Siège chauffant";


    public double getPrix()

    {
        return prix;}

        public String toString () {
        return nom + getPrix();
    }

}