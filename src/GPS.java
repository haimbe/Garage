public class GPS implements Option{
    double prix = 223.5;
    String nom = "GPS";





    public double getPrix()
    {
        return prix;}

        public String toString () {
        return nom + getPrix();
    }


}
